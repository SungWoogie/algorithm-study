package baekjoon;

import java.util.Scanner;

public class Q20492 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int total = n * 22 / 100; // 220
        int tax = n - total; // 780
        int percent = n * 80 / 100; // 800
        int rest = percent * 22 / 100; // 176
        int result = rest + tax;

        System.out.println(tax + " " + result);
    }
}