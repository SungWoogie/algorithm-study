package zerobase;

public class PreCodingTest_1_5_5 {
    public static String solution(String s) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                stringBuilder.append(String.valueOf(s.charAt(i)).toLowerCase());
            } else {
                stringBuilder.append(String.valueOf(s.charAt(i)).toUpperCase());
            }
        }
        answer = stringBuilder.toString();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("Naver")); // nAVER
    }

}
