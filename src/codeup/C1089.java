package codeup;

import java.util.Scanner;

public class C1089 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int temp = scanner.nextInt();
        int value = scanner.nextInt();

        for (int i = 1; i <= value; i++) {
            if (i != value) {
                num += temp;
            }
        }
        System.out.println(num);
    }
}
