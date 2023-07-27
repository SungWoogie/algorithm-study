package zerobase;

public class CodingTest_230727_2 {
    public static int solution(int depth, int n, int[][] blocks) {
        int[][] dp = new int[depth][n];

        // 첫 번째 깊이의 블록은 에너지 소비가 없음
        for (int i = 0; i < n; i++) {
            dp[0][i] = blocks[0][i];
        }

        // 동적 프로그래밍을 통해 최소 에너지 계산
        for (int d = 1; d < depth; d++) {
            for (int i = 0; i < n; i++) {
                int prevEnergy = Integer.MAX_VALUE;

                // 이전 깊이에서 가능한 블록들 중 최소 에너지를 찾음
                for (int j = i - 1; j <= i + 1; j++) {
                    if (j >= 0 && j < n) {
                        prevEnergy = Math.min(prevEnergy, dp[d - 1][j]);
                    }
                }

                dp[d][i] = blocks[d][i] + prevEnergy;
            }
        }

        // 마지막 깊이에서 최소 에너지를 찾음
        int minEnergy = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minEnergy = Math.min(minEnergy, dp[depth - 1][i]);
        }

        return minEnergy;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 3, new int[][]{
                {5, 6, 2, 6},
                {1, 6, 4, 9},
                {5, 6, 8, 4},
                {55, 14, 21, 14}})); // 24
    }

}
