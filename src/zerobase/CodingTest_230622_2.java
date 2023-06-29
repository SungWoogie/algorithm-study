package zerobase;

import java.util.Arrays;

public class CodingTest_230622_2 {
    public static int solution(int[] numbers, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, Integer.MAX_VALUE - 1);
        dp[0] = 0;

        for (int i = 1; i <= target; i++) {
            for (int num : numbers) {
                if (i >= num) {
                    dp[i] = Math.min(dp[i], dp[i - num] + 1);
                }
            }
        }

        return dp[target] == Integer.MAX_VALUE - 1 ? -1 : dp[target];
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 4, 2}, 12));
    }
}
