package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2577_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int multiply = a * b * c;

        while (multiply > 0) {
            int percent = multiply % 10;
            multiply /= 10;
            arr[percent]++;
        }
        for (int s : arr) {
            System.out.println(s);
        }
    }
}
