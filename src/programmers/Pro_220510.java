package programmers;

public class Pro_220510 {   // 서울에서 김서방 찾기
    public static String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();
        String answer;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                sb.append("김서방은 ").append(i).append("에 있다");
                break;
            }
        }
        answer = String.valueOf(sb);
        return answer;
    }

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution(seoul));
    }
}
