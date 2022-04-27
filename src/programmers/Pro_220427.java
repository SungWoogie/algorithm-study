package programmers;

public class Pro_220427 {
    public static String solution(String str, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();     // 알파벳 붙이기 위해 Builder 생성

        for (int i = 0; i < str.length(); i++) {    // 파라미터로 받은 문자열 길이 만큼 반복
            char ch = str.charAt(i);    // 하나씩 확인하기 위하 쪼개 준다.
            if (ch == ' ') {    // 제한사항에 공백이면 그냥 넘어가기 위해 공백이 들어왔을 시 저장하고 continue
                sb.append(ch);
                continue;
            }
            if (ch >= 'A' && ch <= 'Z') {               // 대문자인지 확인
                if (ch + n > 'Z') {                     // 대문자인데 Z보다 클 경우 처음으로 돌아가기 위해 이중 조건
                    sb.append((char) (ch - 26 + n));    // 그냥 출력하면 숫자로 반환하기 때문에 char 로 형변환
                } else {                                // z-26+n -> 122(z) - 26(알파벳 개수) + 받은 수
                    sb.append((char) (ch + n));         // z보다 크지 않을 경우 문자 붙이기
                }

            } else if (ch >= 'a' && ch <= 'z') { // 소문자 확인
                if (ch + n > 'z') {
                    sb.append((char) (ch - 26 + n));
                } else {
                    sb.append((char) (ch + n));
                }
            }
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        String str = "a B z";
        int n = 4;

        System.out.println(solution(str, n));
    }
}

