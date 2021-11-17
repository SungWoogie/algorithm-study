package review;

import java.util.Scanner;

public class Q2914_review {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int i = scanner.nextInt();

        int result = a * i; // 912

        System.out.println(result - a + 1);
    }
}
