package baekjoon;
// 2021.11.16

import java.util.Scanner;

public class Q1712 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // 고정 지출
        int b = scanner.nextInt(); // 처음 인권비
        int c = scanner.nextInt(); // 1대 가격

        if (b >= c) { // 손익존재하지 않으면 -1
            System.out.println(-1);
        } else {
            System.out.println(a / (c - b) + 1);
        }
    }
}