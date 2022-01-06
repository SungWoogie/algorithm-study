package codeup;

import java.util.Scanner;

public class C1257 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (a <= b) {
            if (a % 2 == 1) {
                System.out.print(a + " ");
            }
            a++;
        }
    }
}
