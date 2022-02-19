package baekjoon;

import java.util.Scanner;

public class Q2495 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String str = scanner.next();
            int count = 0;
            int max = 0;
            char tmp = str.charAt(0); // 처음 문자 한개 저장

            for (int j = 1; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (tmp == ch) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 1;
                    tmp = ch;
                }
                max = Math.max(max, count);
            }
            System.out.println(max);
        }
    }
}
