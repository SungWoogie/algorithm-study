package baekjoon;

import java.util.Scanner;

public class Q14489 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int chicken = scanner.nextInt();
        int tmp = chicken * 2;

        int sum = a + b;

        if (sum >= tmp) {
            System.out.println(sum - tmp);
        } else {
            System.out.println(sum);
        }
    }
}
