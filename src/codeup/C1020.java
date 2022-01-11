package codeup;

import java.util.Scanner;

public class C1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        str = str.replace("-", "");
        System.out.println(str);
    }
}
