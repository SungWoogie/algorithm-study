package review;

import java.util.Scanner;

public class Q2231_Re {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int sum = i;
            int tmp = i;

            while (0 < tmp) {
                sum += tmp % 10;
                tmp /= 10;
            }
            if (sum == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
