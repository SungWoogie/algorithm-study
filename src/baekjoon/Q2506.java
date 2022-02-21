package baekjoon;

import java.util.Scanner;

public class Q2506 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int count = 0;
        int value = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if (num == 1) {
                count++;
                value += count;
            } else {
                count = 0;
            }
        }
        System.out.println(value);
    }
}
