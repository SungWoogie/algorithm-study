package baekjoon;

import java.util.Scanner;

public class Q8370 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int k1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int k2 = scanner.nextInt();

        int first = n1 * k1;
        int second = n2 * k2;

        System.out.println(first + second);
    }
}
