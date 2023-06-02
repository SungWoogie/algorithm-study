package zerobase;

import java.util.*;

// 각 아파트에서 가장 가까운 버스 정류장까지의 거리
public class PreCodingTest_3_4_3 {
    private static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static int[][] solution(int[][] city) {

        int rows = city.length;
        int cols = city[0].length;
        int[][] distances = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            Arrays.fill(distances[i], Integer.MAX_VALUE);
        }

        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (city[i][j] == 0) {
                    distances[i][j] = 0;
                    queue.offer(new int[]{i, j});
                }
            }
        }

        // 너비 우선 탐색(BFS)을 사용하여 거리 계산
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int currRow = curr[0];
            int currCol = curr[1];

            for (int[] direction : DIRECTIONS) {
                int newRow = currRow + direction[0];
                int newCol = currCol + direction[1];

                if (isValidPosition(newRow, newCol, rows, cols) && distances[newRow][newCol] == Integer.MAX_VALUE) {
                    distances[newRow][newCol] = distances[currRow][currCol] + 1;
                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }

        return distances;
    }

    private static boolean isValidPosition(int row, int col, int rows, int cols) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(new int[][]{{1, 0, 1}, {1, 1, 1}, {1, 1, 1,}})));
        // {{1,0,1},
        // {2,1,2},
        // {3,2,3}}
    }
}

