package codeup;

import java.util.Scanner;

public class C1033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        String str = Integer.toHexString(a);
        System.out.println(str.toUpperCase());
    }
}
