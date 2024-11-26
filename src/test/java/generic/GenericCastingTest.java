package generic;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * fileName       : GenericCastingTest
 * author         : baehyoyeol
 * date           : 2023/07/26
 * description    :
 */
@Slf4j
public class GenericCastingTest {

    @Test
    @DisplayName("instanceof casting test")
    void casting() {
        Object object = "test";
        if (object instanceof String) {
            String string = (String) object;
            log.info("string = {}", string);
        }
        Assertions.assertThat(object).isInstanceOf(Number.class);
    }

    @Test
    @DisplayName("generic casting test")
    void castCasting() {
        Object object = "test";
        String string = (String) object;
        log.info("string = {}", string);
        Assertions.assertThat(object).isInstanceOf(Number.class);
    }
}
