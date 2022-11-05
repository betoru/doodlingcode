package check.code.designpattern.creation;

import check.code.designpattern.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * fileName       : BuilderTest
 * author         : baehyoyeol
 * date           : 2022/11/02
 * description    : design pattern - builder of creation
 * 생성 디자인 패턴은 기존 코드의 유연성과 재사용을 증가시키는 객체를 생성하는 다양한 방법 제공
 * Builder는 복잡한 객체들을 단계별로 생성할 수 있도록 하는 생성 디자인패턴.
 * Builder의 등장
 * 많은 필드와 중첩된 객체들을 힘들게 단계별로 초기화해야 하는 복잡한 객체가 있음.
 * 이런 초기화 코드는 일반적으로 많은 매개변수가 있는 거대 생성자 내부에 묻혀 있음.
 */
public class BuilderTest {
    @Test
    @DisplayName("past1")
    void objectPast() {
        List<String> roles = List.of("admin", "user");
        // 객체 생성
        User user = new User();
        user.setUsername("baehyoyeol");
        user.setEmail("abc@abc.com");
        user.setRoles(roles);
        for (String role : roles) {
            System.out.println("role = " + role);
        }
        String toString = user.toString();
        System.out.println("toString = " + toString);
    }
}
