package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q10798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[5][15];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                Arrays.fill(arr[i], 10);
            }
        }
        for (int i = 0; i < 5; i++) {
            String str = scanner.next();

            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == 10) {
                    continue;
                }
                System.out.print(((char) arr[j][i]));
            }
        }
    }
}
