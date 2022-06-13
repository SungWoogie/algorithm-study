package programmers;

public class Pro_220610 { // JadenCase 문자열 만들기
    public static void main(String[] args) {
        // 도움 코드
        String str = "3people unFollowed me";
        System.out.println(solution(str));

    }

    public static String solution(String str) {
        StringBuilder answer = new StringBuilder(); // answer 을 StringBuilder 형으로 선언.
        String firstStr = str.charAt(0) + ""; // 첫 글자는 무조건 대문자이기 때문에 대문자로 만들어서 answer 에 더해준다.

        answer.append(firstStr.toUpperCase());

        for (int i = 1; i < str.length(); i++) { // 문자열 길이만큼 반복.
            String ch = str.charAt(i) + "";
            if (ch.equals(" ")) { // 현재 문자가 공백이면 공백을 answer 에 더해준다.
                answer.append(' ');
            } else if (str.charAt(i - 1) == ' ') { // 전 문자열이 공백이면 대문자로 치환해서 answer 에 더해준다.
                answer.append(ch.toUpperCase());
            } else {
                answer.append(ch.toLowerCase()); // 그 외에 전부 소문자로 치환해서 answer 에 더한다.
            }
        }

        return answer.toString();
    }
}
