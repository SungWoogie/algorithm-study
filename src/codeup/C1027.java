package codeup;

import java.util.Scanner;

public class C1027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] word = scanner.next().split("\\.");
        System.out.printf("%s-%s-%s", word[2], word[1], word[0]);
    }
}
