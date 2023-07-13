package zerobase;

public class CodingTest_230713_2 {
    public static int solution(int[] amount, int[] value, int[] stomach) {
        int answer = 0;

        int n = amount.length;
        int[][][] dp = new int[n + 1][][];
        for (int i = 0; i <= n; i++) {
            dp[i] = new int[1001][];
            for (int j = 0; j <= 1000; j++) {
                dp[i][j] = new int[stomach.length + 1];
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= 1000; j++) {
                for (int k = 1; k <= stomach.length; k++) {
                    if (amount[i - 1] > j) {
                        dp[i][j][k] = dp[i - 1][j][k];
                    } else {
                        dp[i][j][k] = Math.max(dp[i - 1][j][k], dp[i - 1][j - amount[i - 1]][k - 1] + value[i - 1]);
                    }
                }
            }
        }

        answer = dp[n][1000][stomach.length];
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(
                new int[]{7, 10, 4, 5},
                new int[]{5, 4, 3, 1},
                new int[]{4, 6, 2, 8})); // 74
    }

}
