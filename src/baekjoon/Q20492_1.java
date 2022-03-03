package baekjoon;

import java.util.Scanner;

public class Q20492_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int value = n - ((n * 22) / 100); // 780
        int value1 = (n * 80) / 100; // 800
        int value2 = (value1 * 22) / 100; // 176

        System.out.println(value + " " + (value + value2));
    }
}
