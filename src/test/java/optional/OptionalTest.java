package optional;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.platform.commons.util.StringUtils;

import entity.Employee;
import lombok.extern.slf4j.Slf4j;
import util.FruitEnum;

/**
 * Optional Test
 */
@Slf4j
public class OptionalTest {

    /**
     * 테스트를 위한 Data Set
     * null 이면 빈값으로 넘겨주고 null 이 아니면 대문자로 넘겨주는 로직 테스트
     */
    private static Stream<Arguments> nameFactory() {
        return Stream.of(
                Arguments.arguments(null, ""),
                Arguments.arguments("matthew", "MATTHEW"));
    }

    @ParameterizedTest
    @MethodSource("nameFactory")
    public void null_체크하는_전통적인방법(String name, String expected) {
        String name2 = name;
        if (name2 == null) {
            name2 = "";
            // name2.toUpperCase(); // null을 toUpperCase 하면 NullPointerException 발생
        }
        String result = name2.toUpperCase();
        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("nameFactory")
    @DisplayName("Optional 로 null 체크하기")
    public void checkNullWithOptional(String name, String expected) {
        String result = Optional.ofNullable(name) // null 이면 아래의 orElse() 를 실행한다.
                .orElse("") // null 이면 "" 를 넣어주고 null 이 아니면 다음 chain 을 실행한다.
                .toUpperCase(); // null 이 아니면 대문자로 변환한다.
        assertThat(result).isEqualTo(expected);

        /**
         * Optional 은 아래와 같이 사용하라고 나온게 아니다.
         * null 이 들어올 것을 알고 후처리를 하기 위한 용도.
         * 사용자에게 메시지를 넘긴다거나 어떤 로직을 수행한다거나.
         */
        if (Optional.ofNullable(name).isPresent()) {
            log.info("name = {}", name);
        }
    }

    private static Stream<Arguments> listFactory() {
        List<Employee> employees = List.of(
                Employee.builder().name("matthew").department("sales").build(),
                Employee.builder().name("luke").department("development").build(),
                Employee.builder().name("mark").department("sales").build(),
                Employee.builder().name("john").department("development").build());
        return Stream.of(
                Arguments.arguments(employees, "matthew", "sales"),
                Arguments.arguments(employees, "luke", "development"),
                Arguments.arguments(employees, "_blank_", "ceo"));
    }

    @ParameterizedTest
    @MethodSource("listFactory")
    @DisplayName("부서별로 조회하고, 목록의 첫번째 직원 정보를 가져오기")
    public void getFirstEmployeeByDepartment(List<Employee> employees, String name, String department) {
        String findFirstEmployeeByDept = employees.stream()
                .filter(emp -> emp.getDepartment().equals(department))
                .findFirst()
                .map(e -> e.getName())
                .orElse("_blank_");
        Assertions.assertThat(findFirstEmployeeByDept).isEqualTo(name);
    }

    /**
     * repository 에서 데이터 조회 결과가 null 인 경우 return type 을 단순히 Employee 로 하지말고
     * Optional<Employee> 로 하면 전통적인 방식의 null 체크를 하지 않고 후처리 로직을 수행할 수 있다.
     *
     * @param employees
     * @param department
     * @return
     */
    private Optional<Employee> findFirstEmpByDept(List<Employee> employees, String department) {
        /*
         * return employees.stream()
         * .filter(emp -> emp.getDepartment().equals(department))
         * .findFirst();
         */

        List<Employee> employeeList = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getDepartment().equals(department)) {
                employeeList.add(employee);
            }
        }
        return employeeList.size() == 0 ? Optional.empty() : Optional.of(employeeList.get(0));
    }

    @ParameterizedTest
    @MethodSource("listFactory")
    @DisplayName("올바른 optional 사용법")
    public void getFirstEmployeeByDepartment2(List<Employee> employees, String name, String department) {
        Optional<Employee> findFirstEmployeeByDept = findFirstEmpByDept(employees, department);
        if (findFirstEmployeeByDept.isEmpty()) {
            log.info("해당 부서에 직원이 없습니다.");
        } else {
            assertThat(findFirstEmployeeByDept.get().getName()).isEqualTo(name);
        }
    }

    @Test
    @DisplayName("Optional Test")
    void optionalTest() {

        // 객체 선언
        Optional<String> opt = Optional.of("test"); // null이 아닌 객체를 담는다.
        Optional<String> opt2 = Optional.ofNullable(null); // null일 수도 있는 객체를 담는다. null이면 empty 객체를 담는다.
        Optional<String> opt3 = Optional.empty(); // null 값으로 초기화
    }

    private static Stream<Arguments> basicFactory() {
        return Stream.of(
                Arguments.arguments("바나나", "BANANA"),
                Arguments.arguments("", "no value"),
                Arguments.arguments("파인애플", "PINEAPPLE"),
                Arguments.arguments("딸기", "STRAWBERRY"));
    }

    @ParameterizedTest
    @MethodSource("basicFactory")
    @DisplayName("Optional null 및 empty 테스트")
    public void checkNullAndEmptyByOptional(String fruit, String expected) {
        String opt = Optional.ofNullable(fruit)
                .filter(StringUtils::isNotBlank)
                .map(FruitEnum::matchByKorName)
                .filter(Objects::nonNull)
                .orElse(expected);
        assertThat(opt).isEqualTo(expected);
    }
}
