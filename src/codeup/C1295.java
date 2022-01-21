package codeup;

import java.util.Scanner;

public class C1295 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder print = new StringBuilder();
        String str = scanner.next();
        int temp = 0;
        for (int i = 0; i < str.length(); i++) {
            temp = str.charAt(i);

            if (65 <= temp && temp <= 90) {
                print.append((char) (temp + 32));
            } else if (97 <= temp && temp <= 122) {
                print.append((char) (temp - 32));
            } else {
                print.append((char) temp);
            }
        }
        System.out.println(print);
    }
}
