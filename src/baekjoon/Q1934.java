package baekjoon;

import java.util.Scanner;

public class Q1934 { // 최소공배수
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            int save = b;

            while (true) {
                if (b % a == 0) {
                    break;
                } else {
                    b += save;
                }
            }
            System.out.println(b);
        }
    }
}
