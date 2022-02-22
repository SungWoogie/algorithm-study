package baekjoon;

import java.util.Scanner;

public class Q2577_220222 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[9];

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int multiply = a * b * c;

        while (0 < multiply) {
            int divide = multiply % 10;
            multiply /= 10;
            arr[divide]++;
        }
        for (int value : arr) {
            System.out.println(value);
        }
    }
}
