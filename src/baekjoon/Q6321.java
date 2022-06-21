package baekjoon;

import java.util.Scanner;

public class Q6321 { // IBM 빼기 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            String str = scanner.next();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'Z') {
                    sb.append((char) (str.charAt(j) - 25));
                } else {
                    sb.append((char) (str.charAt(j) + 1));
                }
            }
            System.out.printf("String #%d\n", i + 1);
            System.out.println(sb.append("\n"));
        }
    }
}
