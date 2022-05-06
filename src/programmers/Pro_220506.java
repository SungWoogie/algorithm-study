package programmers;

public class Pro_220506 {
    public static String solution(int n) {
        String answer;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sb.append("수");
            } else {
                sb.append("박");
            }
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(solution(n));
    }
}
