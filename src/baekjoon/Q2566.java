package baekjoon;

import java.util.Scanner;
// 2차원 배열 최대값
public class Q2566 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[9][9];

        int max = 0;
        int firstIndex = 0;
        int lastIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scanner.nextInt();

                if (arr[i][j] > max) {
                    max = arr[i][j];
                    firstIndex = i;
                    lastIndex = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((firstIndex + 1) + " " + (lastIndex + 1));
    }
}
