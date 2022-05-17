package programmers;

public class Pro_220517 { // 두 정수 사이의 합
    public static long solution(int a, int b) {

        long answer = 0;

        if (a <= b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println(solution(a, b));
    }
}
