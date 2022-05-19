package programmers;

public class Pro_220519 { // 가운데 글자 가져오기
    public static String solution(String str) {
        String answer;

        if (str.length() % 2 != 0) { // 문자열 길이가 짝수가 아닌가?
            answer = String.valueOf(str.charAt(str.length() / 2));
        } else { // 짝수면
            answer = str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(solution(str));
    }

}
