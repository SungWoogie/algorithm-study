package codeup;

import java.util.Scanner;

public class C1158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n >= 30 && n <= 40 || n >= 60 && n <= 70) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }
    }
}
