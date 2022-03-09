package baekjoon;

import java.util.Scanner;

public class Q1152_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine().trim();
        String[] strArr = str.split(" ");

        if (str.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(strArr.length);
        }
    }
}
