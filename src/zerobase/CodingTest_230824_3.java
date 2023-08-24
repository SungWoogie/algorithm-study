package zerobase;

public class CodingTest_230824_3 {
    public static int solution(int[] status) {
        int n = status.length;
        int[] dp = new int[n + 2];

        // Initialize dp array with a large value
        for (int i = 0; i <= n + 1; i++) {
            dp[i] = Integer.MAX_VALUE / 2;
        }

        // Base case
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            // Press the button at index i
            dp[i + 1] = Math.min(dp[i + 1], dp[i] + 1);

            // Press the button at index i and its neighbors
            dp[i + 2] = Math.min(dp[i + 2], dp[i] + 1);

            // Press the button at index i and its neighbors' neighbors
            dp[i + 3] = Math.min(dp[i + 3], dp[i] + 1);
        }

        if (status[n - 1] == 0) {
            return dp[n];
        } else if (n > 1 && status[n - 2] == 0) {
            return dp[n - 1];
        } else {
            return dp[n - 2];
        }
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 0, 1, 0, 1}));
    }

}
