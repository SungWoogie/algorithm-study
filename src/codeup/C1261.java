package codeup;

import java.util.Scanner;

public class C1261 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        for (int i = 0; i < 10; i++) {
            int n = scanner.nextInt();
            if (n % 5 == 0) {
                num = n;
                break;
            }
        }
        System.out.println(num);
    }
}
