package codeup;

import java.util.Scanner;

public class C1163 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        int num = y + m + d;
        int divide = 0;
        int count = 0;
        while (count < 3) {
            divide = num % 10;
            num /= 10;
            count++;
        }

        if (divide % 2 == 0) {
            System.out.println("대박");
        } else {
            System.out.println("그럭저럭");
        }
    }
}
