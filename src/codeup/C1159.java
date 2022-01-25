package codeup;

import java.util.Scanner;

public class C1159 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n >= 50 && n <= 70|| n % 6 == 0) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }
    }
}
