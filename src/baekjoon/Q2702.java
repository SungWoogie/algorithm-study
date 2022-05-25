package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2702 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int max = 0;
            int min = 0;

            int j = 1;
            while (true) {  // 최소 공배수
                if (a % j == 0 && b % j == 0) {
                    min = j;
                }
                if (j % a == 0 && j % b == 0) {
                    max = j;
                    break;
                }
                j++;
            }
            System.out.println(max + " " + min);
        }
    }
}