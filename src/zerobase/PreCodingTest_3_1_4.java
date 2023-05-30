package zerobase;

public class PreCodingTest_3_1_4 {
    public static String solution(String s) {
        if (s.length() != 12) {
            return "NO";
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '1') {
                count++;
            } else {
                if (count >= 3) {
                    return "YES";
                }
                count = 0;
            }
        }
        if (count >= 3) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {

        System.out.println(solution("011110")); //
        System.out.println(solution("010101010101")); //
        System.out.println(solution("111000010100")); // yes
        System.out.println(solution("001001000100")); // no
    }

}
