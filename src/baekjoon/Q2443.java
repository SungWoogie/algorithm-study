package baekjoon;

import java.util.Scanner;

public class Q2443 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= 2 * n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
