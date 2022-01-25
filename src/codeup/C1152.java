package codeup;

import java.util.Scanner;

public class C1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n < 10) {
            System.out.println("small");
        } else {
            System.out.println("big");
        }
    }
}
