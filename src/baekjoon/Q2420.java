package baekjoon;
// 2021.11.16

import java.util.Scanner;

public class Q2420 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long m = scanner.nextLong();

        System.out.println(Math.abs(n - m));
    }
}

