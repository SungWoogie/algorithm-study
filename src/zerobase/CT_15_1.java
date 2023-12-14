package zerobase;

public class CT_15_1 {
    public static boolean solution(String s) {
        if (s.length() < 6 || s.length() > 20) {
            return false;
        }
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2)) {
                return true;
            }
        }
        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if ("!@#$%^&*()".indexOf(ch) != -1) {
                hasSpecialChar = true;
            }
        }
        return hasLowerCase && hasUpperCase && hasDigit && hasSpecialChar;
    }

    public static void main(String[] args) {
        String str = "zeRobAsE!2#4";
        System.out.println(solution(str));
    }

}
