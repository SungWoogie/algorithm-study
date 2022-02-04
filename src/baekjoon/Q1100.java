package baekjoon;

import java.util.Scanner;

public class Q1100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        boolean 홀수 = true;

        for (int i = 0; i < 8; i++) {
            String str = scanner.next();

            for (int j = 0; j < str.length(); j++) {
                if (j % 2 == 1 && 홀수) {
                    if (str.charAt(j) == 'F') {
                        count++;
                    }
                }
                if (j % 2 == 0 && !홀수) {
                    if (str.charAt(j) == 'F') {
                        count++;
                    }
                }
            }
            홀수 = !홀수;
        }
        System.out.println(count);
    }
}