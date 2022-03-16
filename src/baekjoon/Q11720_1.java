package baekjoon;

import java.util.Scanner;

public class Q11720_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        String num = scanner.next();
        int sum = 0;

        for (int i = 0; i < t; i++) {
            sum += num.charAt(i) - 48;
        }
        System.out.println(sum);
    }
}
