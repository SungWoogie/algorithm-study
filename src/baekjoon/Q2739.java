package baekjoon;

import java.util.Scanner;

public class Q2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = n; i <= n; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(n + " " + "*" + " " + j + " " + "=" + " " + n * j);
            }
        }
    }
}
