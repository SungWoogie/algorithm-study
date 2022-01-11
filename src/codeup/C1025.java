package codeup;

import java.util.Scanner;

public class C1025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.next();
        char[] ch = num.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            System.out.print("[" + ch[i]);
            for (int j = ch.length - 1; j > i; j--) {
                System.out.print("0");
            }
            System.out.println("]");
        }
    }
}
