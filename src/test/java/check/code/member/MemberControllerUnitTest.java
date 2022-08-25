package check.code.member;

import com.google.gson.Gson;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class MemberControllerUnitTest {
    @Autowired
    MockMvc mvc;

    @MockBean
    MemberService memberService;

    @Test
    @DisplayName("멤버 전체조회 테스트")
    void getMemberListTest() throws Exception {
        List<Member> members = new ArrayList<>();
        members.add(Member.builder().name("John").build());

//        given(memberService.list()).willReturn(members);

        mvc.perform(get("/api/member"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("John")));
    }

    @Test
    @DisplayName("멤버 추가 테스트")
    void insertMemberTest() throws Exception {
        Member member = Member.builder().name("Tom").build();
        Gson gson = new Gson();
        String content = gson.toJson(member);

        mvc.perform(post("/api/member")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(content))
                .andExpect(status().isCreated());

//        verify(memberService).insert(member);
    }
}
