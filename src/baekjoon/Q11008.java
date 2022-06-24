package baekjoon;

import java.util.Scanner;

public class Q11008 { // 복붙의 달인
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            String str = scanner.next();
            String result = str.replace(scanner.next(), "1");
            System.out.println(result.length());
        }

    }
}
