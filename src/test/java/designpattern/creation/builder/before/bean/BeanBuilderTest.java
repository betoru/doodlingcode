package designpattern.creation.builder.before.bean;

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
public class BeanBuilderTest {
    @Test
    @DisplayName("java bean pattern (getter/setter)")
    void initializeObjectByGetterSetter() {
        designpattern.creation.builder.before.bean.Student student = new designpattern.creation.builder.before.bean.Student(); // 객체 생성 -> 기본적인 빈 생성자가 호출돼
        student.setSequence(1L);
        student.setName("baehyoyeol");
        student.setAge(19);
        student.setSex("male");

        log.info("student1 : {}", student);
    }
}
