package codeup;

import java.util.Scanner;

public class C1087 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (sum < num) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
