package baekjoon;

import java.util.Scanner;

public class Q2965 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int ab = b - a - 1;
        int bc = c - b - 1;

        System.out.println(Math.max(ab, bc));
    }
}
