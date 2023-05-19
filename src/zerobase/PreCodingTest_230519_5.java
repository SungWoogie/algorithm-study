package zerobase;

public class PreCodingTest_230519_5 {
    public static String solution(String[] arr) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : arr) {
            stringBuilder.append(str).append(",");
        }
        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        answer = stringBuilder.toString();

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"naver", "kakao"}));
    }

}
