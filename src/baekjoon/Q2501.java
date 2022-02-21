package baekjoon;

import java.util.Scanner;

public class Q2501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 6
        int k = scanner.nextInt(); // 3

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                k--;
            }
            if (k == 0) {
                System.out.println(i);
                break;
            }
        }
        if (k != 0) {
            System.out.println(0);
        }
    }
}
