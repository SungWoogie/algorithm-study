package review;

import java.util.Scanner;

public class Q11721_Re {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String str = scanner.next();

        for (int i = 1; i <= str.length(); i++) {
            char ch = str.charAt(i - 1);
            sb.append(ch);
            if (i % 10 == 0) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
