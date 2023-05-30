package zerobase;

// 자리수에 숫자들 중 팰린드롬 찾기
public class PreCodingTest_3_1_3 {
    public static long solution(int n) {
        long answer = 0;
        long[] dp = new long[10001];
        dp[0] = 1;
        dp[1] = 10;
        dp[2] = 9;
        int divide = 1_000_000_007;
        for (int i = 3; i < dp.length; i++) {
            if (i % 2 == 0) {
                dp[i] = dp[i - 1] % divide;
            } else {
                dp[i] = 10 * dp[i - 1] % divide;
            }
        }
        answer = dp[n];
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(1)); // 10
        System.out.println(solution(2)); // 9
        System.out.println(solution(3)); //90
    }

}
