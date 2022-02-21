package codeup;

import java.util.Scanner;

public class C1281 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum -= i;
                System.out.print("-" + i);
            } else {
                sum += i;
                if (i == a) {
                    System.out.print(i);
                } else {
                    System.out.print("+" + i);
                }
            }
        }
        System.out.print("=" + sum);
    }
}

