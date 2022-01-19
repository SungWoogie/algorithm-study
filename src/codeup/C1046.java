package codeup;

import java.util.Scanner;

public class C1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int sum = a + b + c;
        float average = (float) sum / 3;

        System.out.println(sum);
        System.out.printf("%.1f", average);
    }
}
