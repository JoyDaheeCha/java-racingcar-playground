package StringAddCalculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    static int splitAndSum(String input) {

        // 0 체크
        if (isNullOrEmptyString(input)) {
            return 0;
        }

        String delimiterRegex = makeDelimiterGroup(input);// delimiter 생성
        String[] tokens = splitInputToStrArr(input, delimiterRegex); // 덧셈에 사용할 숫자 리스트 얻기 (문자형)
        int[] numArr = convertStrArrToIntarr(tokens); // 덧셈에 사용할 숫자 리스트 얻기 (int형)

        for (int i = 0; i < numArr.length; i++) {
            checkNegativeInput(numArr[i]);
        }

        return getSum(numArr);

    }

    static void checkNegativeInput(int num) {
        if(num < 0) {
            throw new RuntimeException();
        }
    }

    static int getSum(int[] numArr) {
        return Arrays.stream(numArr).sum();
    }

    static int[] convertStrArrToIntarr(String[] tokens) {
        return Arrays.stream(tokens).mapToInt(Integer::parseInt).toArray();
    }

    static String[] splitInputToStrArr(String input, String delRegex) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
        if (m.find()) {
            String customDelimiter = m.group(1);
            String[] tokens= m.group(2).split(customDelimiter);
            return tokens;
        }
        return input.split(delRegex);

    }

    static boolean isNullOrEmptyString (String input) {
        if (input == null || input.isEmpty()) {
            return true;
        }
        return false;
    }

    static String makeDelimiterGroup(String input) {
        String delimiterRegex = "[:,]+";
        if (input.contains("//") && input.contains("\n")) {
            int startIdx = input.indexOf("//") + 2;
            int endIdx = input.indexOf("\n");

            String customDelimiter = input.substring(startIdx, endIdx);
            delimiterRegex = "[:," + customDelimiter + "]+";
        }
        return delimiterRegex;
    }
}
