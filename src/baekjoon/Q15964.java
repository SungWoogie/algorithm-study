package baekjoon;

import java.util.Scanner;

public class Q15964 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        System.out.println((a + b) * (a - b));
    }
}
