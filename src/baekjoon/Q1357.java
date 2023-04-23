package baekjoon;

import java.util.Scanner;

public class Q1357 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt(); // 123
        int y = scanner.nextInt(); // 100

        // 숫자를 먼저 뒤집기
        int xReversed = 0;
        while (x > 0) {
            int percent = x % 10;
            xReversed = xReversed * 10 + percent;
            x /= 10;
        }

        int yReversed = 0;
        while (y > 0) {
            int percent = y % 10;
            yReversed = yReversed * 10 + percent;
            y /= 10;
        }
        // 나온 숫자 더하고 뒤집기
        int sum = xReversed + yReversed;
        int result = 0;
        while (sum > 0) {
            int percent = sum % 10;
            result = result * 10 + percent;
            sum /= 10;
        }
        System.out.println(result);
    }
}