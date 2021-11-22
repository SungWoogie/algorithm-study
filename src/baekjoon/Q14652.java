package baekjoon;

import java.util.Scanner;

public class Q14652 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 세로
        int m = scanner.nextInt(); // 가로
        int k = scanner.nextInt(); // 자리

        System.out.println(k / m + " " + k / n);

    }
}
