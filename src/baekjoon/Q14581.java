package baekjoon;

import java.util.Scanner;

public class Q14581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String text = ":fan:";

        for (int i = 0; i < 3; i++) {
            System.out.print(text);
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                System.out.printf(":%s:", str);
            } else {
                System.out.print(text);
            }
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(text);
        }
    }
}
