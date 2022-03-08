package baekjoon;

import java.util.Scanner;

public class Q23084 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n * 5; i++) {
            if (i > n && i <= (n * 5) - n) {
                for (int j = 0; j < n; j++) {
                    System.out.print("@");
                }
            } else {
                for (int j = 0; j < n * 5; j++) {
                    System.out.print("@");
                }
            }
            System.out.println();
        }
    }
}

