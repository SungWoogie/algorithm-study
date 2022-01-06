package codeup;

import java.util.Scanner;

public class C1265 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = n; i <= n; i++) {
            for (int j = 1; j <= 9; j++) {
                int multiply = n * j;
                System.out.printf("%d*%d=%d\n", n, j, multiply);
            }
        }
    }
}
