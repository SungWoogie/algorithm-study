package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// 시간 초과
public class Q15784 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int value = arr[a - 1][b - 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][b - 1] > value) {
                value = arr[i][b - 1];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[a - 1][i] > value) {
                value = arr[a - 1][i];
            }
        }
        if (value == arr[a - 1][b - 1]) {
            bw.write("HAPPY\n");
        } else {
            bw.write("ANGRY\n");
        }
        bw.flush();
        bw.close();
    }
}
