package codeup;

import java.util.Scanner;

public class C1068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n >= 90) {
            System.out.println("A");
        } else if (n >= 70) {
            System.out.println("B");
        } else if (n >= 40) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
