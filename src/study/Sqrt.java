package study;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int n = scanner.nextInt();
            System.out.println((int) Math.sqrt(n));
        }
    }
}
