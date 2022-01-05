package codeup;

import java.util.Scanner;

public class C1254 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char str = scanner.next().charAt(0);
        char str1 = scanner.next().charAt(0);

        if (str < str1) {
            while (str <= str1) {
                System.out.print(str + " ");
                str++;
            }
        } else if (str > str1) {
            while (str1 <= str) {
                System.out.print(str1 + " ");
                str1++;
            }
        } else {
            System.out.print(str);
        }
    }
}
