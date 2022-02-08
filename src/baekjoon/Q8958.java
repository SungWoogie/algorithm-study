package baekjoon;

import java.util.Scanner;

public class Q8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // 5

        for (int i = 0; i < t; i++) {
            String str = scanner.next();
            int count = 0;
            int value = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (ch == 'O') {
                    count++; // 1
                    value += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(value);
        }
    }
}
