package codeup;

import java.util.Scanner;

public class C1407 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] word = str.split(" ");

        for (String s : word) {
            System.out.print(s);
        }
    }
}
