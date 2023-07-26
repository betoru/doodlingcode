package date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Date 관련
 *
 * @author betoru
 * @since 2023-04-25
 */
public class TestLocalDate {

    @Test
    @DisplayName("LocalDate 표현 테스트")
    void testLocalDate() {
        System.out.println("LocalDate.now(): " + java.time.LocalDate.now());
        System.out.println("LocalDate.now().toString(): " + java.time.LocalDate.now().toString());
        System.out.println("LocalDate.now().format(DateTimeFormatter.ofPattern(\"yyyy-MM-dd\")): " + java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }
    @Test
    @DisplayName("LocalDateTime 표현 테스트")
    void testLocalDateTime() {
        System.out.println("LocalDateTime.now(): " + java.time.LocalDateTime.now());
        System.out.println("LocalDateTime.now().toString(): " + java.time.LocalDateTime.now().toString());
        System.out.println("LocalDateTime.now().format(DateTimeFormatter.ofPattern(\"yyyy-MM-dd HH:mm:ss\")): " + java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
