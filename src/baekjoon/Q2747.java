package baekjoon;

import java.util.Scanner;

public class Q2747 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a = 0;
        int b = 1; //
        int tmp = 0; // 1 2 3

        if (n == 1) {
            System.out.println(1);
        } else {
            for (int i = 1; i < n; i++) { // 전에 값 계속 더하면서 저장장                tmp = a + b;
                a = b;
                b = tmp;
            }
            System.out.println(tmp);
        }
    }
}
