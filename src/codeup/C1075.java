package codeup;

import java.util.Scanner;

public class C1075 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
