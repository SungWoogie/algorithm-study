package baekjoon;

import java.util.Scanner;

public class Q10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int multiply = 1;
        if (n == 0) {
            System.out.println(1);
        } else {
            for (int i = 1; i <= n; i++) {
                multiply *= i;
            }
            System.out.println(multiply);
        }
    }
}
