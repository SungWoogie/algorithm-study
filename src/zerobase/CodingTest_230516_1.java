package zerobase;

// 탑쌓기
public class CodingTest_230516_1 {
    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(4));
    }

}
