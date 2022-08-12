package check.code.masking;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 이름, 이메일, 전화번호 등 개인정보 따위 마스킹처리
 */
public class MaskingTest {
    @Test
    @DisplayName("이름의 가장 좌우를 제외하고 마스킹이 되나요?")
    void makingNameTest() {
        String maskingName = MaskingUtil.maskingName("홍길동");
        System.out.println("maskingName = " + maskingName);
        Assertions.assertThat(maskingName).isEqualTo("홍*동");
    }

    @Test
    @DisplayName("이름의 가장 좌우를 제외하고 마스킹이 되나요?")
    void makingPhoneNumberTest() {
        String maskedPhoneNumber = MaskingUtil.maskingPhoneNumber("010-1111-2222");
        System.out.println("maskedPhoneNumber = " + maskedPhoneNumber);
        Assertions.assertThat(maskedPhoneNumber).isEqualTo("010-****-1111");
    }

}
