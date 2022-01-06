package codeup;

import java.util.Scanner;

public class C1260 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;

        while (a <= b) {
            if (a % 3 == 0) {
                sum += a;
            }
            a++;
        }
        System.out.println(sum);
    }
}
