package baekjoon;

import java.util.Scanner;

public class Q11721 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= str.length(); i++) {
            char c = str.charAt(i-1);
            sb.append(c);
            if (i % 10 == 0) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
