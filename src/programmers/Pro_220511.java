package programmers;

public class Pro_220511 {   // 문자열 다루기 기본
    public static boolean solution(String str) {
        boolean answer = true;

        int count = 0;
        if (str.length() == 4 || str.length() == 6) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                    count++;
                }
            }
        }
        if (count == str.length()) {
            return answer;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "";
        System.out.println(solution(str));
    }
}
