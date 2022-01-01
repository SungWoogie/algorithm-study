package codeup;

import java.util.Scanner;

public class C1092 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int day = 1;

        while (true) {
            if (day % a != 0 || day % b != 0 || day % c != 0) {
                day++;
            } else {
                break;
            }
        }
        System.out.println(day);
    }
}
