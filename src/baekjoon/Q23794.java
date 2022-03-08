package baekjoon;

import java.util.Scanner;

public class Q23794 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n + 2; i++) {
            for (int j = 1; j <= n + 2; j++) {
                if (i == 1 || i == n + 2 || j == 1 || j == n + 2) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
