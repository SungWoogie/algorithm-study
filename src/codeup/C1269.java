package codeup;

import java.util.Scanner;

public class C1269 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // 시작 값
        int b = scanner.nextInt(); // 곱할 값
        int c = scanner.nextInt(); // 더할 값
        int n = scanner.nextInt(); // 몇번째 값

        for (int i = 1; i < n; i++) {
            a = a * b + c;
        }
        System.out.println(a);
    }
}
