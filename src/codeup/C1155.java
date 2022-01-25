package codeup;

import java.util.Scanner;

public class C1155 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n % 7 == 0) {
            System.out.println("multiple");
        } else {
            System.out.println("not multiple");
        }
    }
}
