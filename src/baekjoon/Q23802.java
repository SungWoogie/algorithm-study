package baekjoon;

import java.util.Scanner;

public class Q23802 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n * 5; i++) {
            if (i < n) {
                for (int j = 0; j < n * 5; j++) {
                    System.out.print("@");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    System.out.print("@");
                }
            }
            System.out.println();
        }
    }
}
