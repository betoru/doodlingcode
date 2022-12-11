package enumtest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * fileName       : TestEnum1Test
 * author         : baehyoyeol
 * date           : 2022/11/28
 * description    :
 */
class EnumTestByExpression {

    @Test
    @DisplayName("TestEnum1 테스트")
    void basicEnum() {
        TestEnum1 testEnum1 = TestEnum1.RED;
        System.out.println("testEnum1 = " + testEnum1);

        /*enum은 클래스이기 때문에 enum 내부에 필드와 메소드를 가질 수 있다.
        기본적으로 열거한 값들은 public static final이다.
        또한 정의된 열거체의 첫 번째 상수값은 0부터 설정*/
        TestEnum1[] values = TestEnum1.values();
        for (TestEnum1 value : values) {
            System.out.println("value.ordinal() = " + value.ordinal());
        }
        assertEquals(TestEnum1.RED, TestEnum1.valueOf("RED"));
        assertEquals(TestEnum1.ORANGE, TestEnum1.valueOf("ORANGE"));
        assertEquals(TestEnum1.YELLOW, TestEnum1.valueOf("YELLOW"));
        assertEquals(TestEnum1.GREEN, TestEnum1.valueOf("GREEN"));
        assertEquals(TestEnum1.BLUE, TestEnum1.valueOf("BLUE"));
        assertEquals(TestEnum1.INDIGO, TestEnum1.valueOf("INDIGO"));
        assertEquals(TestEnum1.VIOLET, TestEnum1.valueOf("VIOLET"));


    }

    @Test
    @DisplayName("TestEnum2 테스트")
    void customEnum() {
        /*불규칙한 값을 상수값으로 설정하고 싶으면
        상수의 이름 옆에 괄호(())을 추가하고,
        그 안에 원하는 상수값을 명시할 수 있습니다.*/
        TestEnum2[] testEnum2 = TestEnum2.values();
        for (TestEnum2 enum2 : testEnum2) {
            System.out.println("enum2 = " + enum2);
            System.out.println("enum2.getValue() = " + enum2.getValue());
            //ordinal : 서수표현 첫번째, 두번째, 세번째...
            System.out.println("enum2.ordinal() = " + enum2.ordinal());
        }
        assertEquals(TestEnum2.RED, TestEnum2.valueOf("RED"));
        assertEquals(TestEnum2.RED.getValue(), TestEnum2.valueOf("RED").getValue());
    }
    @Test
    @DisplayName("값 비교 테스트")
    void compareEnum() {
        int testValue = 5;
        Enum<TestEnum2> result = TestEnum2.matchByValue(testValue);
        System.out.println("result = " + result);
        assertEquals(TestEnum2.GREEN, result);
    }
}