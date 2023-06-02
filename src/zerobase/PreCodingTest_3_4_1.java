package zerobase;

// dp 사용해서 경우의 수 구하기 fail
public class PreCodingTest_3_4_1 {
    public static int solution(int n, int k) {
        if (n == 0) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k && j <= i; j++) {
                if (j != dp[i - 1]) {
                    dp[i] += dp[i - j];
                    dp[i] %= 1_000_000_007;
                }
            }
        }

        return dp[n] * 2;
    }
    public static void main(String[] args) {
        System.out.println(solution(5, 3)); // 4
    }
}

