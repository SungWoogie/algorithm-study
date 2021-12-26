package codeup;

import java.util.Scanner;

public class C1079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.next();
            char ch = str.charAt(0);

            if (ch == 'q') {
                System.out.println(ch);
                break;
            } else {
                System.out.println(ch);
            }
        }
    }
}

