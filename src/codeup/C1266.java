package codeup;

import java.util.Scanner;

public class C1266 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }
}
