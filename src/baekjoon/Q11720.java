package baekjoon;

import java.util.Scanner;

public class Q11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String str = scanner.next();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int ch = str.charAt(i) - 48;
            sum += ch;
        }
        System.out.println(sum);
    }
}
