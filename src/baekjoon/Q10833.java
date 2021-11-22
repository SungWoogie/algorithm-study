package baekjoon;

import java.util.Scanner;

public class Q10833 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 학교 개수

        int value = 0;

        for (int i = 1; i <= n; i++) {
            int p = scanner.nextInt(); // 학생 수
            int k = scanner.nextInt(); // 사과 개수

            value += k % p;

        }
        System.out.println(value);

    }
}