package codeup;

import java.util.Scanner;

public class C1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String[] ch = str.split(":");

        if (ch[1].equals("00") ) {
            ch[1] = "0";
        }
        System.out.println(ch[1]);
    }
}
