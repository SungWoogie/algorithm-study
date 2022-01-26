package codeup;

import java.util.Scanner;

public class C1162 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        int num = y - m + d;
        num %= 10;

        if (num == 0) {
            System.out.println("대박");
        } else {
            System.out.println("그럭저럭");
        }
    }
}
