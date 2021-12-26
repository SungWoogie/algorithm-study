package codeup;

import java.util.Scanner;

public class C1071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            int num = scanner.nextInt();

            if (num != 0) {
                System.out.println(num);
            } else {
                break;
            }
        }
    }
}
