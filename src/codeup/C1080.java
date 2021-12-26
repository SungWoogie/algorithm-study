package codeup;

import java.util.Scanner;

public class C1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (sum < num) {
                sum += i;
                count++;
            }
        }
        System.out.println(count);
    }
}
