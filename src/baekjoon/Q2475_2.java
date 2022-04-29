package baekjoon;

import java.util.Scanner;

public class Q2475_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = 0;
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();

            value += (int) Math.pow(num, 2); // Math.pow 제곱하는 메소드
        }
        System.out.println(value % 10);
    }
}
