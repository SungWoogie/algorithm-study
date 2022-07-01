package programmers;

public class Lv1_Pro_220630_4 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            boolean pass = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    pass = false;
                    break;
                }
            }
            if (pass) {
                answer++;
            }
        }
        System.out.println(Math.sqrt(2));
        return answer;
    }


    public static void main(String[] args) {
        int n = 10;
        Lv1_Pro_220630_4 s = new Lv1_Pro_220630_4();

        System.out.println(s.solution(n));
    }
}
