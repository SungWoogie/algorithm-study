package baekjoon;

import java.util.Scanner;

public class Q9295 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            sum = a + b;

            System.out.printf("Case %d: %d", i, sum);
            System.out.println();
        }
    }
}
