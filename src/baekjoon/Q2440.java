package baekjoon;

import java.util.Scanner;

public class Q2440 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) { // 줄
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
    }
}
