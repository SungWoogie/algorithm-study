package review;

import java.util.Scanner;

public class Q17496_Review {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 지속되는 날
        int t = scanner.nextInt(); // 자라는 일
        int c = scanner.nextInt(); // 심는 칸
        int p = scanner.nextInt(); // 개당 가격

        int divide = (n - 1) / t; // 2
        int multiply = divide * c; // 4

        System.out.println(multiply * p);
    }
}
