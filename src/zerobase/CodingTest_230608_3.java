package zerobase;

import java.util.Arrays;

public class CodingTest_230608_3 {
    public static int solution(int N) {
        if (N <= 2) {
            return N;
        }

        int[] dp = new int[N + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[N];
    }

    public static void main(String[] args) {
        System.out.println(solution(4)); // 5

    }
}
