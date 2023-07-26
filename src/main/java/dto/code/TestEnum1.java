package dto.code;

/**
 * fileName       : TestEnum1
 * author         : baehyoyeol
 * date           : 2022/11/28
 * description    : enumeration class(=열거체)
 *                  enum은 클래스이기 때문에 enum 내부에 필드와 메소드를 가질 수 있다.
 *                  기본적으로 열거한 값들은 public static final이다.
 *                  또한 정의된 열거체의 첫 번째 상수값은 0부터 설정되며,
 *                  그 다음은 바로 앞의 상수값보다 1만큼 증가되며 설정
 *                  열거체를 사용하는 기본방법은 Test Code 참고
 */
public enum TestEnum1 {
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE,
    INDIGO,
    VIOLET
}

