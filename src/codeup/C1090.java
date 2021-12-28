package codeup;

import java.util.Scanner;

public class C1090 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextInt(); // 2
        long multiply = scanner.nextInt(); // 3
        long max = scanner.nextInt(); // 7

        for (int i = 1; i < max; i++) {
            num = num * multiply;
        }
        System.out.println(num);
    }
}
