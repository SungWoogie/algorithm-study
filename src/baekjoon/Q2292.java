package baekjoon;

import java.util.Scanner;

public class Q2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 1; // 최소 루트
        int scope = 2; // 최소값

        if (n == 1) {
            System.out.println(1);
        } else {
            while (scope <= n) { // 범위가 n 보다 커지기 전까지 반복
                scope = scope + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}
