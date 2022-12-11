package designpattern.creation.builder.before.constructor;

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
public class ConstructorBuilderTest {
    /**
     * 점층적 생성자 패턴
     *  getter/setter 와는 다르게 한줄로 끝남.
     *  근데 만일 초기화 할 값이 유동적이라면?
     *  FYI. 자바빈 패턴이 점층적 생성자 패턴의 단점을 보완하여 고안됐다고 함.
     */
    @Test
    @DisplayName("constructor initialize")
    void initializeObjectByConstructor() {
        //전체 필드 생성자를 호출했음. optional 한 필드의 경우는 어떻게 해야함?
//        Student2 student2 = new Student2(1L, "betoru", 19, "male");

        //optional 한 경우 null 로 초기화 하거나
//        Student2 student2 = new Student2(1L, "betoru", 19, null);

        //optional 한 경우 생성자를 따로 만들어야함.
        designpattern.creation.builder.before.constructor.Student student = new designpattern.creation.builder.before.constructor.Student(2L, "baehyo", 19);
        log.info("student2 : {}", student);
    }
}
