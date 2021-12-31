package codeup;

import java.util.Scanner;

public class C1091 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong(); // 시작값
        long multiply = scanner.nextLong(); // 곱할값
        long sum = scanner.nextLong(); // 더할값
        long num = scanner.nextLong(); // 정수 값

        for (int i = 1; i < num; i++) {
            n = (n * multiply) + sum;
        }
        System.out.println(n);
    }
}
