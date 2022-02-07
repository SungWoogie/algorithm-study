package codeup;

import java.util.Scanner;

public class C1276 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int num = 1;

        for (int i = 1; i <= n; i++) {
            num *= i;
        }
        System.out.println(num);
    }
}
