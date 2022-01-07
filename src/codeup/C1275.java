package codeup;

import java.util.Scanner;

public class C1275 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int n = 1;
        for (int i = 0; i < b; i++) {
            n *= a;
        }
        System.out.println(n);
    }
}
