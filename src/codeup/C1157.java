package codeup;

import java.util.Scanner;

public class C1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextDouble();

        if (n >= 50 && n <= 60) {
            System.out.println("win");
        } else {
            System.out.println("lose");
        }
    }
}
