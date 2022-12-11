package check.doodlingCode.testmethods.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 *
 * #1. @WebMvcTest
 *  - Web Layer 만 테스트할 때 사용
 * #2. @WebMvcTest(ContollerClassName.class)
 *  - 특정 컨트롤러만 인스턴스화하여 테스트하는 것도 가능
 *  - 실제 연결이 생성되는 것은 아님
 * #3. 컨트롤러의 의존성은 @MockBean 으로 모의 의존관계 생성 및 주입
 *  - MockMvc 객체를 주입받아 해당 객체를 이용하여 테스트 진행
 *  - ref : HelloController
 */
@WebMvcTest
public class WebMvcTestController {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void searchTest() throws Exception {
        this.mockMvc.perform(get("/books"));
    }

}
