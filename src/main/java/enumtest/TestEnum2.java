package enumtest;

/**
 * fileName       : TestEnum1
 * author         : baehyoyeol
 * date           : 2022/11/28
 * description    : enum 테스트2
 *                  불규칙한 값을 상수값으로 설정하고 싶으면 상수의 이름 옆에 괄호'()'를 추가하고,
 *                  그 안에 원하는 상수값을 명시할 수 있습니다.
 *                  하지만 이때에는 불규칙한 특정 값을 저장할 수 있는 인스턴스 변수(value)와 생성자를 별도로 추가해야만 합니다.
 */
public enum TestEnum2 {
    //불규칙한 상수값
    RED(3),
    ORANGE(10),
    YELLOW(21),
    GREEN(5),
    BLUE(4),
    INDIGO(-1),
    VIOLET(-10);

    private final int value;

    TestEnum2(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Enum<TestEnum2> matchByValue(int value) {
        for (TestEnum2 testEnum2 : TestEnum2.values()) {
            if (testEnum2.getValue() == value) {
                return testEnum2;
            }
        }
        return null;
    }
}

