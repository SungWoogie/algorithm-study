package baekjoon;

import java.util.Scanner;

public class Q2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int multiply = a * b * c;
        int percent;

        while (0 < multiply) {
            percent = multiply % 10;
            multiply /= 10;
            arr[percent]++;
        }
        for (int n : arr) {
            System.out.println(n);
        }
    }
}
