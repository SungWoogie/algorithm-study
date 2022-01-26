package codeup;

import java.util.Scanner;

public class C1165 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int s = scanner.nextInt();
        int count = 0;

        for (int i = t; i < 90; i += 5) {
            count++;
        }
        System.out.println(s + count);
    }
}
