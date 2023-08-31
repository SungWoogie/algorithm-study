package zerobase;

public class CodingTest_230831_1 {
    public static int solution(String s) {
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;

        int index = 0;
        int sign = 1;
        int result = 0;

        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }

        if (index < s.length() && (s.charAt(index) == '-' || s.charAt(index) == '+')) {
            if (s.charAt(index) == '-') {
                sign = -1;
            }
            index++;
        }

        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            if (result < maxValue / 10 || (result == maxValue / 10 && digit <= maxValue % 10)) {
                result = result * 10 + digit;
            } else {
                return sign == 1 ? maxValue : minValue;
            }

            index++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        System.out.println(solution(" - 42514243zero123base")); // -42514243
    }

}
