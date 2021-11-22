package baekjoon;

import java.util.Scanner;

public class Q2845 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = scanner.nextInt();
        int p = scanner.nextInt();

        int multiply = l * p; // 100

        for (int i = 0; i < 5; i++) {
            int entry = scanner.nextInt();

            System.out.print(-multiply + entry + " ");
        }
    }
}