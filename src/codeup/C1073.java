package codeup;

import java.util.Scanner;

public class C1073 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            } else {
                System.out.println(num);
            }
        }
    }
}
