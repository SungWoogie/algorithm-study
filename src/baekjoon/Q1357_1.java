package baekjoon;

import java.util.Scanner;

public class Q1357_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int xReversed = reverse(x); // 123 넘겨주기
        int yReversed = reverse(y); // 100 넘겨주기

        int sum = xReversed + yReversed;
        int result = reverse(sum);
        System.out.println(result);
    }

    public static int reverse(int num) {
        int reversed = 0;
        while (num > 0) {
            int percent = num % 10;
            reversed = reversed * 10 + percent;
            num /= 10;
        }
        return reversed;
    }
}