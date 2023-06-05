package zerobase;

// 자릿수 카운트 세기
public class CodingTest_230605_1 {
    public static long solution(int N) {
        long answer = 0;

        for (int i = 1; i <= N; i++) {
            int number = i;
            while (number > 0) {
                int digit = number % 10;
                if (digit == 3 || digit == 7) {
                    answer++;
                }
                number /= 10;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(37)); // 16
        System.out.println(solution(100)); // 40
    }
}
