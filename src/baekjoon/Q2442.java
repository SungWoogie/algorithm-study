package baekjoon;

import java.util.Scanner;

public class Q2442 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) { // 9
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
