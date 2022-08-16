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
        String maskingName = MaskingUtil.maskingName("이형근");
        System.out.println("maskingName = " + maskingName);
        Assertions.assertThat(maskingName).isEqualTo("이*근");
    }

    @Test
    @DisplayName("폰번호 마스킹을 해보자. 값이 있는 경우 없는 경우")
    void makingPhoneNumberTest() {
        String maskedPhoneNumber = MaskingUtil.maskingPhoneNumber("11111111111");
        System.out.println("maskedPhoneNumber = " + maskedPhoneNumber);
        Assertions.assertThat(maskedPhoneNumber).isEqualTo("111-****-1111");
    }

}
