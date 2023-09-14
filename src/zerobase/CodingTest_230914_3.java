package zerobase;

// X
public class CodingTest_230914_3 {
    public static int solution(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n];

        dp[0] = arr[0];

        for (int i = 1; i < n; i++) {
            dp[i] = arr[i];

            for (int j = 1; j <= k && i - j >= 0; j++) {
                dp[i] = Math.max(dp[i], dp[i - j] + arr[i]);
            }
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, -1, -20, 4, -7, 5}, 2));
    }

}
