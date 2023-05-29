package baekjoon;

import java.util.Scanner;

// 2차원 배열의 합, S : 5
public class B2167 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // 2차원 배열 생성 & 배열에 값 저장하기
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // 쿼리의 개수 입력 받기
        int k = scanner.nextInt();

        // k 만큼 반복하면서 sum 출력
        for (int r = 0; r < k; r++) {
            int sum = 0;
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // 쿼리 범위 내의 원소 합 구하기
            for (int row = i - 1; row < x; row++) {
                for (int col = j - 1; col < y; col++) {
                    sum += arr[row][col];
                }
            }
            System.out.println(sum);
        }
    }
}
