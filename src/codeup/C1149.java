package codeup;

import java.util.Scanner;

public class C1149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a);
        } else if (a < b){
            System.out.println(b);
        } else {
            System.out.println(b);
        }
    }
}
