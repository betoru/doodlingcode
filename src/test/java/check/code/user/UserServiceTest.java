package check.code.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

//테스트가 수행되는 클래스가 mockito 를 사용함을 declare 한다
@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserService userService;

    @Test
    @DisplayName("신규유저를 저장")
    void saveUser() {

        //given => 테스트를 위한 준비과정. 변수를 선언 mock 객체에 대한 정의도 함께 작성

        //builder 를 사용
        User user = User.builder()
                .idx(1)
                .username("betoru")
                .email("betoru@anyssign.com")
                .roles(Arrays.asList("USERS", "ADMIN")).build();

        //import static org.mockito.Mockito.when;
        //import static org.mockito.ArgumentMatchers.any;
        when(userRepository.save(any())).thenReturn(user); //mock 객체를 주입

        //when => 테스트를 실행하는 과정. 테스트하고자 하는 내용을 작성
        User result = userService.createUser(User.builder().username("betoru").build());

        //then => 테스트를 검증하느느 과정. 예상값과 결과값의 일치 여부 확인
        verify(userRepository, times(1)).save(any());
        Assertions.assertEquals(result, user);
    }
}
