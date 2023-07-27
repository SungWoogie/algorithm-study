package zerobase;

import java.util.Arrays;
import java.util.Comparator;

public class CodingTest_230727_1 {
    public static int solution(int[] start, int[] end, int[] price) {
        int n = start.length;
        int[][] appointments = new int[n][3];

        for (int i = 0; i < n; i++) {
            appointments[i][0] = start[i];
            appointments[i][1] = end[i];
            appointments[i][2] = price[i];
        }
        Arrays.sort(appointments, Comparator.comparingInt(a -> a[1]));

        int[] dp = new int[n];
        dp[0] = appointments[0][2];

        for (int i = 1; i < n; i++) {
            int prevMaxProfit = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (appointments[j][1] <= appointments[i][0]) {
                    prevMaxProfit = dp[j];
                    break;
                }
            }
            dp[i] = Math.max(dp[i - 1], appointments[i][2] + prevMaxProfit);
        }

        return dp[n - 1];
    }


    public static void main(String[] args) {
        System.out.println(solution(
                new int[]{1, 5, 10, 6, 5},
                new int[]{5, 6, 12, 9, 12},
                new int[]{10, 40, 30, 20, 50})); // 100
    }

}
