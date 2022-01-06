package codeup;

import java.util.Scanner;

public class C1268 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            if (n % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
