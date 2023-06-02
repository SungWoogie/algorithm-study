package zerobase;

import java.util.Arrays;

// 방 탈출 최소 시간 구하기 (dp)
public class PreCodingTest_3_5_3 {
    public static int solution(int[][] A) {
        int rows = A.length;
        int[][] dp = new int[rows][];

        dp[rows - 1] = Arrays.copyOf(A[rows - 1], A[rows - 1].length);

        for (int i = rows - 2; i >= 0; i--) {
            dp[i] = new int[A[i].length];
            for (int j = 0; j < A[i].length; j++) {
                dp[i][j] = A[i][j] + Math.min(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1}, {2, 5}, {7, 10, 1}, {9, 4, 4, 5}})); // 11
    }
}

