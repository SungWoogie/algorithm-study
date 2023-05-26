package zerobase;

// N까지 K번째 의 숫자가 몇개 나오는지 찾기
public class PreCodingTest_2_4_1 {
    public static int solution(int N, int K) {
        int answer = 0;

        for (int i = 1; i <= N; i++) {
            int num = i;
            while (num > 0) {
                int percent = num % 10;
                if (percent == K) {
                    answer++;
                }
                num /= 10;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(25 , 2)); // 9
    }
}

