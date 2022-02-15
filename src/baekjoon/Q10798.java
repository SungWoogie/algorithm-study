package baekjoon;

import java.util.Scanner;

public class Q10798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] charArr = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String str = scanner.next();

            for (int j = 0; j < str.length(); j++) {
                charArr[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (charArr[j][i] == ' ' || charArr[j][i] == '\0') {
                    continue;
                }
                System.out.print(charArr[j][i]);
            }
        }
    }
}
