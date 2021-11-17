package baekjoon;

import java.util.Scanner;

public class Q17496 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 일 수
        int t = scanner.nextInt(); // 걸리는 일 수
        int c = scanner.nextInt(); // 심을 수 있는 칸의 수
        int p = scanner.nextInt(); // 개당 가격


        int divide = n / t;
        if (n % t == 0) {
            divide -= 1;
        }
        System.out.println(divide * c * p);
    }
}
