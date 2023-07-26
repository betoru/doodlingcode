package dto.code;

import lombok.Getter;

/**
 * fileName       : TestEnum1
 * author         : baehyoyeol
 * date           : 2022/11/28
 * description    : enum 테스트2
 *                  불규칙한 값을 상수값으로 설정하고 싶으면 상수의 이름 옆에 괄호'()'를 추가하고,
 *                  그 안에 원하는 상수값을 명시할 수 있습니다.
 *                  하지만 이때에는 불규칙한 특정 값을 저장할 수 있는 인스턴스 변수(value)와 생성자를 별도로 추가해야만 합니다.
 */
@Getter
public enum TestEnum3 {
    //불규칙한 상수값
    RED(3,"빨강"),
    ORANGE(10, "주황"),
    YELLOW(21, "노랑"),
    GREEN(5, "초록"),
    BLUE(4, "파랑"),
    INDIGO(-1, "남색"),
    VIOLET(-10, "보라");

    private final int value;
    private final String korName;

    TestEnum3(int value, String korName) {
        this.value = value;
        this.korName = korName;
    }


    //값이 value 와 매치되면 korName을 반환
    public static String matchByValue(int value) {
        for (TestEnum3 testEnum3 : TestEnum3.values()) {
            if (testEnum3.getValue() == value) {
                return testEnum3.getKorName();
            }
        }
        return null;
    }
}

