package codeup;

import java.util.Scanner;

public class C1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("minus");
        } else {
            System.out.println("plus");
        }
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
