package baekjoon;

import java.util.Scanner;

public class Q2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int percent = 0;
        int sum = 0;
        int total = 0;

        for (int i = 0; i < 3; i++) {
            percent = b % 10;
            b /= 10;
            if (i == 0) {
                sum = a * percent;
                System.out.println(sum);
                total += sum;
            } else if (i == 1) {
                sum = a * percent;
                System.out.println(sum);
                total += (sum * 10);
            } else {
                sum = a * percent;
                System.out.println(sum);
                total += (sum * 100);
            }
        }
        System.out.println(total);
    }
}
