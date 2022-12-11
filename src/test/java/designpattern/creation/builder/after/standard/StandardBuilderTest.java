package designpattern.creation.builder.after.standard;

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
public class StandardBuilderTest {
    @Test
    @DisplayName("builder initialize")
    void initializeObjectByBuilder() {
        Student student = new ConcreteStudentBuilder()
                            .sequence(1L)
                            .name("betoru")
                            .age(10)
                            .sex("male")
                            .build();
        log.info("student3 : {}", student);

        Student student_1 = new ConcreteStudentBuilder()
                            .sequence(1L)
                            .name("betoru")
                            .sex("male")
                            .build();
        log.info("student3_1 : {}", student_1);
    }
}
