package baekjoon;

import java.util.Scanner;

public class Q1100_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean even = true; // 짝수
        int count = 0;

        for (int i = 0; i < 8; i++) {
            String str = scanner.next();
            for (int j = 0; j < 8; j++) {

                if (even && j % 2 == 0) {
                    if (str.charAt(j) == 'F') {
                        count++;
                    }
                }
                if (!even && j % 2 == 1) {
                    if (str.charAt(j) == 'F') {
                        count++;
                    }
                }
            }
            even = !even;
        }
        System.out.println(count);
    }
}
