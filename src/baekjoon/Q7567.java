package baekjoon;

import java.util.Scanner;

public class Q7567 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int sum = 10;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                sum += 5;
            } else {
                sum += 10;
            }
        }
        System.out.println(sum);
    }
}
