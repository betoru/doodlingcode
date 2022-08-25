package check.code.skill.masking;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

public class MaskingUtil {

    private static final Logger logger = LoggerFactory.getLogger(MaskingUtil.class);

    public static String maskingName(final String originalName) {
        if (StringUtils.isEmpty(originalName)) {
            throw new IllegalArgumentException("이름은 필수값입니다.");
        }
        String regex = "(^[가-힣]+)$";
        Matcher matcher = Pattern.compile(regex).matcher(originalName);

        if (matcher.find()) {

            int length = originalName.length();

            String middleMask = "";
            if (length > 2) {
                middleMask = originalName.substring(1, length - 1);
            } else {
                middleMask = originalName.substring(1, length);
            }

            String dot = "";
            for (int i = 0; i < middleMask.length(); i++) {
                dot += "*";
            }

            String maskedName = "";
            if (length > 2) {
                return maskedName = originalName.substring(0, 1)
                        + middleMask.replace(middleMask, dot)
                        + originalName.substring(length - 1, length);
            } else {
                return maskedName = originalName.substring(0, 1)
                        + middleMask.replace(middleMask, dot);
            }
        }
        return originalName;
    }

    public static String maskingPhoneNumber(String phoneNumber) {
        String regex = "(\\d{2,3})-?(\\d{3,4})-?(\\d{4})$";
        Matcher matcher = Pattern.compile(regex).matcher(phoneNumber);

        /*
            이전 커밋과 비교할 것.
            중간 번호만 마스킹 처리를 하려는데 중복된 그룹인 경우,
            모두 바뀌게되어 그룹별로 나눠 중간그룹만 바꿨음.
         */
        if (matcher.find()) {
            String group1 = matcher.group(1);
            String group2 = matcher.group(2);
            String group3 = matcher.group(3);
            int length = group2.length();
            char[] c = new char[length];
            Arrays.fill(c, '*');

            return group1 + "-" + group2.replace(group2, String.valueOf(c)) + "-" + group3;
        }
        return phoneNumber;
    }

    @Test
    @DisplayName("matcher : 마스킹에 쓰인 정규식녀석을 테스트해봅세")
    void matcherTest() {
        /*
            An engine that performs match operations on a character sequence by interpreting a Pattern.
            matcher 는 어떤 패턴에 의해 나열된 문자를 매칭작업을 수행함.
            따라서 아래와 같은 절차가 필요.
            Pattern p = Pattern.compile("a*b");
            Matcher m = p.matcher("aaaaab");
            boolean b = m.matches();
        */
        Pattern p = Pattern.compile("(a*b)(foo)");
        Matcher m = p.matcher("aabfooaabfooabfoob");
        System.out.println("m = " + m);
        System.out.println();

        boolean m1 = m.find();
        boolean m2 = m.find();
        boolean m3 = m.find();
        System.out.println("m1 = " + m1 + " : " + m.end());
        System.out.println("m2 = " + m2 + " : " + m.end());
        System.out.println("m3 = " + m3 + " : " + m.end());
        System.out.println();

        String group = m.group();
        String group0 = m.group(0);
        String group1 = m.group(1);
        String group2 = m.group(2);
//        String group3 = m.group(3);
        System.out.println("group = " + group);
        System.out.println("group0 = " + group0);
        System.out.println("group1 = " + group1);
        System.out.println("group2 = " + group2);
//        System.out.println("group3 = " + group3);
        System.out.println();

        boolean b = m.matches();

        String name = "바보홍길동";
        //1. regex 정규식 : 오로지 한글만을 허용할거야
        String regex = "(^[가-힣]+)$";

        //2. pattern 사용방식
        //2-1. Pattern.compile => 정규식패턴 정의
        Pattern pattern = Pattern.compile(regex);
        //matcher(데이터) => 정의된 패턴의 매칭결과 값을 저장, return Matcher
        Matcher matcher1 = pattern.matcher(name);
        //매칭 유무 반환
        boolean b1 = matcher1.find(1);
        System.out.println("b1 = " + b1);

        //2-2. 정규식패턴 정의와 매칭결과값을 한 라인에 표현가능, Matcher 객체의 멤버 메서드를 사용해야 할 경우
        Matcher matcher2 = Pattern.compile(regex).matcher(name);
        //매칭 유무 반환
        boolean b2 = matcher2.find(2);
        System.out.println("b2 = " + b2);

        //2-3. 매칭유무를 바로 반환 (쓰이는 용도가 정규식과 데이터의 매칭 유무값만을 필요로한 경우)
        boolean b3 = Pattern.matches(regex, name);
        System.out.println("b3 = " + b3);

    }

    @Test
    @DisplayName("아 모르겟슴")
    void findAndGroup() {
        String REGEX = "a*b";
        String INPUT = "aabfooabfooaabfoo";
        Pattern pattern = Pattern.compile(REGEX);

        Matcher matcher = pattern.matcher(INPUT);
        while (matcher.find()) { //검색을 할 인덱스를 지정
            //aab foo ab foo aab foo
            System.out.println(matcher.group()); //매칭된 문자열 반환
            System.out.println(matcher.end()); //매칭이 끝나는 다음 인덱스 반환

        }
    }

    @Test
    @DisplayName("substring : 이것은 그냥 뽀오나쓰")
    void substringTest() {
        /*
            substring args (x, y)
            x => 대상 문자열 시작 인덱스 0에서 부터 제거 할 인덱스 크기
            y => 대상 문자열 마지막 인덱스 length()에서 부터 노출돼야 할 인덱스 크기
         */
        String name = "홍길동";
        //앞에서 1개만큼 제거할거고 뒤에는 length 그대로니까 제거할게 없이 온전히 노출
        String substring = name.substring(1, name.length());
        assertThat(substring).isEqualTo("길동");

    }

    @Test
    @DisplayName("마지막이돠")
    void lastFindAndEnd() {
        String REGEX = "(a*b)(foo)";
        String INPUT = "aabfooaabfooaabfoob";

        Pattern pattern = Pattern.compile(REGEX);

        // get a matcher object
        Matcher matcher = pattern.matcher(INPUT);

        if(matcher.find(6)) {
            //Prints the offset after the last character matched.
//            System.out.println(matcher.group());
            System.out.println("First Capturing Group, (a*b) Match String end(): "+matcher.end(0));
//            System.out.println("Second Capturing Group, (foo) Match String end(): "+matcher.end(1));
        }
//        if(matcher.find(6)) {
//            //Prints the offset after the last character matched.
////            System.out.println(matcher.group());
//            System.out.println("First Capturing Group, (a*b) Match String end(): "+matcher.end());
//            System.out.println("Second Capturing Group, (foo) Match String end(): "+matcher.end(1));
//        }
    }
}
