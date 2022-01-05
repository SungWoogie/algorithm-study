package codeup;

import java.util.Scanner;

public class C1253 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < b) {
            while (a <= b) {
                System.out.print(a + " ");
                a++;
            }
        } else if (b < a) {
            while (b <= a) {
                System.out.print(b + " ");
                b++;
            }
        } else {
            System.out.println(b);
        }
    }
}