package codeup;

import java.util.Scanner;

public class C1024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            System.out.println("'" + a + "'");
        }
    }
}
