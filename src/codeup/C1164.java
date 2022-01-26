package codeup;

import java.util.Scanner;

public class C1164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (170 >= a || 170 >= b || 170 >= c ) {
            System.out.println("CRASH");
        } else{
            System.out.println("PASS");
        }
    }
}
