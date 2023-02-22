package test;

import java.util.Scanner;

public class ExceptionTest2 {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int name = SCANNER.nextInt();
        try {
            name = name % 0;

        } catch (NumberFormatException msg) {

        }
    }


}
