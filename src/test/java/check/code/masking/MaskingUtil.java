package check.code.masking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        if(matcher.find()) {
            String group1 = matcher.group(1);
            String group2 = matcher.group(2);
            String group3 = matcher.group(3);
            int length = group2.length();
            char[] c = new char[length];
            Arrays.fill(c, '*');

            return group1+"-"+group2.replace(group2, String.valueOf(c))+"-"+group3;
        }
        return phoneNumber;
    }
}
