package zerobase;

public class CT_15_3 {
    public static int solution(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n];

        dp[0] = arr[0];

        for (int i = 1; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 1; j <= k && i - j >= 0; j++) {
                max = Math.max(max, dp[i - j] + arr[i]);
            }
            dp[i] = max;
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, -20, 4, -7, 5};
        int k = 2;
        System.out.println(solution(arr, k));
    }

}
