package designpattern.creation.builder.lombok;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * <p>fileName       : BuilderTest</p>
 * <p>author         : baehyoyeol</p>
 * <p>date           : 2022/11/02</p>
 * <p>description    : design pattern - builder of creation</p>
 * <p>                 lombok annotation을 활용한 builder pattern instance 생성</p>
 */
@Slf4j
public class LombokBuilderTest {
    @Test
    @DisplayName("Lombok Builder Pattern")
    void lombokBuilderTest() {
        Student student = Student.builder()
              .sequence(1L)
              .name("baehyoyeol")
              .age(19)
              .build();

        log.info("student : {}", student);
    }
}
