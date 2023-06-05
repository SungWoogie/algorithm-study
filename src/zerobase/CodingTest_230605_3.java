package zerobase;

// 다차원 배열 최소 방문 찾기 fail
import java.util.LinkedList;
import java.util.Queue;

public class CodingTest_230605_3 {
    public static int solution(int N, String[][] board) {
        // 방문 여부를 저장하기 위한 2차원 배열
        boolean[][] visited = new boolean[N][N];
        // 이동할 수 있는 방향 (상, 하, 좌, 우)
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // 시작 위치를 찾음
        int startX = 0, startY = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j].equals("P")) {
                    startX = i;
                    startY = j;
                    break;
                }
            }
        }

        // BFS를 사용하여 타겟 지점까지의 최소 길이를 찾음
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int currX = curr[0];
            int currY = curr[1];
            int dist = curr[2];

            // 현재 위치가 타겟 지점인 경우 최소 길이 반환
            if (board[currX][currY].equals("O")) {
                return dist;
            }

            // 현재 위치에서 이동할 수 있는 모든 방향 확인
            for (int[] direction : directions) {
                int nextX = currX + direction[0];
                int nextY = currY + direction[1];

                // 다음 위치가 범위 내에 있고, 방문하지 않은 곳이고, 벽을 B로 바꿀 수 있는 경우 이동
                if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < N
                        && !visited[nextX][nextY] && (board[nextX][nextY].equals("B") || board[nextX][nextY].equals("O"))) {
                    queue.offer(new int[]{nextX, nextY, dist + 1});
                    visited[nextX][nextY] = true;
                }
            }
        }

        // 타겟 지점까지 갈 수 없는 경우 -1 반환
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(6, new String[][]{
                {"B", "O", "B", "B", "B", "B"},
                {"X", "X", "X", "X", "X", "B"},
                {"B", "B", "O", "B", "P", "B"},
                {"X", "X", "B", "X", "B", "B"},
                {"B", "B", "O", "X", "B", "B"},
                {"B", "B", "B", "B", "B", "B"}})); // 4
        System.out.println(solution(6, new String[][]{
                {"P", "B", "B", "B", "B", "B"},
                {"B", "B", "B", "B", "B", "B"},
                {"B", "B", "X", "X", "X", "X"},
                {"B", "B", "X", "X", "X", "X"},
                {"B", "B", "X", "X", "X", "O"},
                {"B", "B", "X", "X", "O", "O"}})); // -1
        System.out.println(solution(6, new String[][]{
                {"P", "B", "B", "B", "B", "B"},
                {"B", "B", "B", "B", "B", "B"},
                {"B", "B", "X", "X", "X", "X"},
                {"B", "B", "X", "X", "X", "X"},
                {"B", "B", "X", "X", "X", "O"},
                {"B", "B", "X", "B", "O", "O"}})); // 11

    }
}

