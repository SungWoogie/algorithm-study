package codeup;

import java.util.Scanner;

public class C1267 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            if (n % 5 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
