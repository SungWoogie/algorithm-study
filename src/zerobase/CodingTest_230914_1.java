package zerobase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// O
public class CodingTest_230914_1 {
    public static boolean solution(String s) {
        if (s.length() < 6 || s.length() > 20) {
            return false;
        }

        Pattern pattern = Pattern.compile("^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[!@#$%^&*()]).*$");
        Matcher matcher = pattern.matcher(s);
        if (!matcher.matches()) {
            return false;
        }

        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2)) {
                return false;
            }
        }
        for (int i = 0; i < s.length() - 2; i++) {
            char c1 = Character.toLowerCase(s.charAt(i));
            char c2 = Character.toLowerCase(s.charAt(i + 1));
            char c3 = Character.toLowerCase(s.charAt(i + 2));
            if (Character.isLetterOrDigit(c1) && Character.isLetterOrDigit(c2) && Character.isLetterOrDigit(c3)) {
                if (c2 - c1 == 1 && c3 - c2 == 1) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(solution("zeRobAsE!2#4")); // true
    }

}
