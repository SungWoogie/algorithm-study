package zerobase;

public class CodingTest_230727_5 {
    public static int solution(int N, int K1, int K2, int[] W, int[] V) {
        int[][][] dp = new int[N + 1][K1 + 1][K2 + 1];

        for (int i = 1; i <= N; i++) {
            for (int k1 = 0; k1 <= K1; k1++) {
                for (int k2 = 0; k2 <= K2; k2++) {
                    dp[i][k1][k2] = dp[i - 1][k1][k2]; // 현재 짐을 선택하지 않은 경우

                    if (k1 >= W[i - 1]) {
                        dp[i][k1][k2] = Math.max(dp[i][k1][k2], dp[i - 1][k1 - W[i - 1]][k2] + V[i - 1]);
                    }

                    if (k2 >= W[i - 1]) {
                        dp[i][k1][k2] = Math.max(dp[i][k1][k2], dp[i - 1][k1][k2 - W[i - 1]] + V[i - 1]);
                    }
                }
            }
        }

        return dp[N][K1][K2];
    }


    public static void main(String[] args) {
        System.out.println(solution(8, 10, 15,
                new int[]{6, 4, 5, 6, 8, 9, 10, 3},
                new int[]{10, 4, 6, 7, 2, 8, 5, 6}));
    }

}
