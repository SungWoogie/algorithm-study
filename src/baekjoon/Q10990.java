package baekjoon;

import java.util.Scanner;

public class Q10990 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 1; i <= t; i++) {
            for (int j = 0; j < t - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 1) {
                for (int j = 0; j < 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
