package codeup;

import java.util.Scanner;

public class C1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = scanner.next().split("\\.");

        int Y = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int D = Integer.parseInt(str[2]);

        System.out.printf("%04d.%02d.%02d", Y, M, D);
    }
}
