package baekjoon;

import java.util.Scanner;

public class Q4999 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        String str1 = scanner.next();

        if (str.length() < str1.length()) {
            System.out.println("no");
        } else {
            System.out.println("go");
        }
    }

}
