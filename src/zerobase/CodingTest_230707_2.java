package zerobase;

import java.util.Arrays;

public class CodingTest_230707_2 {
    public static int solution(int N, int[] boss, int[] skill) {
        int n = boss.length;
        int[] dp = new int[n];
        dp[0] = boss[0];

        for (int i = 1; i < n; i++) {
            dp[i] = boss[i];
            for (int j = 0; j < i; j++) {
                if (skill[j] > skill[i]) {
                    dp[i] = Math.min(dp[i], dp[j] + boss[i] - skill[i]);
                }
            }
        }

        return dp[n - 1];
    }


    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{10, 8, 12, 5, 20}, new int[]{0, 19, 5, 10, 3})); // 18
        System.out.println(solution(7,
                new int[]{75, 25, 70, 46, 60, 7, 85},
                new int[]{65, 28, 78, 29, 37, 63, 89})); // 30
    }
}