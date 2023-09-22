package zerobase;

import java.util.PriorityQueue;

public class CodingTest_2300921_5 {

  public static int solution(int[][] heights) {
    if (heights == null || heights.length == 0 || heights[0].length == 0) {
      return 0;
    }

    int rows = heights.length;
    int cols = heights[0].length;
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);

    boolean[][] visited = new boolean[rows][cols];

    for (int i = 0; i < rows; i++) {
      pq.offer(new int[]{i, 0, heights[i][0]});
      pq.offer(new int[]{i, cols - 1, heights[i][cols - 1]});
      visited[i][0] = true;
      visited[i][cols - 1] = true;
    }

    for (int j = 0; j < cols; j++) {
      pq.offer(new int[]{0, j, heights[0][j]});
      pq.offer(new int[]{rows - 1, j, heights[rows - 1][j]});
      visited[0][j] = true;
      visited[rows - 1][j] = true;
    }

    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int result = 0;

    while (!pq.isEmpty()) {
      int[] cell = pq.poll();
      int row = cell[0];
      int col = cell[1];
      int height = cell[2];

      for (int[] dir : directions) {
        int newRow = row + dir[0];
        int newCol = col + dir[1];

        if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && !visited[newRow][newCol]) {
          result += Math.max(0, height - heights[newRow][newCol]);
          pq.offer(new int[]{newRow, newCol, Math.max(height, heights[newRow][newCol])});
          visited[newRow][newCol] = true;
        }
      }
    }

    return result;
  }

  public static void main(String[] args) {
    System.out.println(solution(new int[][]{
        {3, 4, 5, 4, 3, 3,},
        {3, 2, 1, 1, 2, 3},
        {4, 2, 1, 1, 2, 3},
        {3, 3, 3, 3, 5, 3}})); // 12

  }

}
