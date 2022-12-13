package designpattern.creation.builder.after.staticnested;

import designpattern.creation.builder.after.staticnested.Student.StudentBuilder;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * <p>fileName       : BuilderTest</p>
 * <p>author         : baehyoyeol</p>
 * <p>date           : 2022/11/02</p>
 * <p>description    : builder of creation pattern</p>
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
