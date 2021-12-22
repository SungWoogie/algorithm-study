package baekjoon;

import java.util.Scanner;

public class Q1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 26
        int count = 0;
        int newNumber = n; // 68

        while (true) {
            count++;
            int percent = newNumber % 10; // 6
            int divide = newNumber / 10; // 2
            int sum = (percent + divide) % 10; // 8

            newNumber = percent * 10 + sum;

            if (n == newNumber) {
                break;
            }
        }
        System.out.println(count);
    }
}
