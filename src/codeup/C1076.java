package codeup;

import java.util.Scanner;

public class C1076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.next().charAt(0); // 문자 입력
        char word = 'a';

        while (word <= ch) {
            System.out.print(word + " ");
            word++;
        }
    }
}
