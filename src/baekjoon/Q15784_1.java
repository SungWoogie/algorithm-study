package baekjoon;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q15784_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int value = arr[a][b];
        for (int i = 1; i <= n; i++) {
            if (arr[i][b] > value) {
                value = arr[i][b];
            }
        }
        for (int i = 1; i <= n; i++) {
            if (arr[a][i] > value) {
                value = arr[a][i];
            }
        }
        if (value == arr[a][b]) {
            System.out.println("HAPPY");
        } else {
            System.out.println("ANGRY");
        }
    }
}

