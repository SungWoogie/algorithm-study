package codeup;

import java.util.Scanner;

public class C1271 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (max < num) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
