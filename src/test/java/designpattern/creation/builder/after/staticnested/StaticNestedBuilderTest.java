package designpattern.creation.builder.after.staticnested;

import designpattern.creation.builder.after.staticnested.Student.StudentBuilder;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * <p>fileName       : BuilderTest</p>
 * <p>author         : baehyoyeol</p>
 * <p>date           : 2022/11/02</p>
 * <p>description    : design pattern - builder of creation</p>
 * <p>                 Builder Pattern : 복잡한 객체들을 단계별로 생성할 수 있도록 하는 생성 디자인패턴.</p>
 * <p>                 생성자에 인자가 많을 때는 Builder 패턴을 사용하는 것이 좋다.</p>
 */
@Slf4j
public class StaticNestedBuilderTest {
    @Test
    @DisplayName("Static Nested Class Builder Pattern")
    void initializeObjectByStaticNestedClassBuilder() {
        //객체의 필수값은 생성자에서 받고, 선택값은 builder 메서드를 통해 받는다.
        Student student = new StudentBuilder(1L, "bae")
              .setAge(19)
              .setSex("male")
              .build();
        log.info("student4 : {}", student);
    }
}
