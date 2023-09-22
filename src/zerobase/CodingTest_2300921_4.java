package zerobase;

import java.util.Arrays;
import java.util.PriorityQueue;

public class CodingTest_2300921_4 {

  public static int solution(int[][] heights) {
    int rows = heights.length;
    int cols = heights[0].length;
    int[][] effort = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      Arrays.fill(effort[i], Integer.MAX_VALUE);
    }

    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
    pq.offer(new int[]{0, 0, 0});

    while (!pq.isEmpty()) {
      int[] cell = pq.poll();
      int row = cell[0];
      int col = cell[1];
      int currEffort = cell[2];

      if (row == rows - 1 && col == cols - 1) {
        return currEffort;
      }

      for (int[] dir : directions) {
        int newRow = row + dir[0];
        int newCol = col + dir[1];

        if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {
          int newEffort = Math.max(currEffort, Math.abs(heights[newRow][newCol] - heights[row][col]));

          if (newEffort < effort[newRow][newCol]) {
            effort[newRow][newCol] = newEffort;
            pq.offer(new int[]{newRow, newCol, newEffort});
          }
        }
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    System.out.println(solution(new int[][]{
        {1, 2, 2},
        {3, 10, 2},
        {5, 3, 5}})); // 2

  }

}
