package baekjoon;

import java.util.Scanner;

public class Q4999 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.next();
        String str2 = scanner.next();

        if (str1.length() < str2.length()) {
            System.out.println("no");
        } else {
            System.out.println("go");
        }
    }

}
