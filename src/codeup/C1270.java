package codeup;

import java.util.Scanner;

public class C1270 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int count = 0;

        int i = 1;
        while (i <= a) {
            int num = i % 10;
            i++;
            if (num % 10 == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
