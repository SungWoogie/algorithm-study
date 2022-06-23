package baekjoon;

import java.util.Scanner;

public class Q11586 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        char[][] chars = new char[testCase][testCase];
        for (int i = 0; i < testCase; i++) {
            String str = scanner.next();
            for (int j = 0; j < testCase; j++) {
                chars[i][j] = str.charAt(j);
            }
        }
        int num = scanner.nextInt();
        if (num == 1) {
            printCurrent(chars);
        } else if (num == 2) {
            printLeftAndRight(chars, testCase);
        } else {
            printReverse(chars, testCase);
        }

    }

    public static void printCurrent(char[][] chars) {
        for (char[] aChar : chars) {
            for (int j = 0; j < chars.length; j++) {
                System.out.println(aChar[j]);
            }
            System.out.println();
        }

    }

    public static void printLeftAndRight(char[][] chars, int testCase) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < testCase / 2; j++) {
                char temp = chars[i][j];
                chars[i][j] = chars[i][testCase - j - 1];
                chars[i][testCase - j - 1] = temp;
            }
        }

        for (int i = 0; i < testCase; i++) {
            for (int j = 0; j < testCase; j++) {
                System.out.println(chars[i][j]);
            }
            System.out.println();
        }

    }

    public static void printReverse(char[][] chars, int testCase) {
        for (int i = 0; i < testCase / 2; i++) {
            for (int j = 0; j < chars.length; j++) {
                char temp = chars[i][j];
                chars[i][j] = chars[testCase - i - 1][j];
                chars[testCase - i - 1][j] = temp;
            }
        }

        for (char[] aChar : chars) {
            for (int j = 0; j < chars.length; j++) {
                System.out.print(aChar[j]);
            }
            System.out.println();
        }
    }

}
