package review;

import java.util.Scanner;

public class Q2675_Re {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String str = scanner.next();

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                for (int k = 0; k < n; k++) {
                    sb.append(ch);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
