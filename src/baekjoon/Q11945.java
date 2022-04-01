package baekjoon;

import java.util.Scanner;

public class Q11945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] n = scanner.nextLine().split(" ");

        int testCase = Integer.parseInt(n[0]);
        int testCase2 = Integer.parseInt(n[1]);

        for (int i = 0; i < testCase; i++) {
            String str = scanner.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < testCase2; j++) {
                sb.append(str.charAt(j));
            }
            String reverseStr = sb.reverse().toString();
            System.out.println(reverseStr);
        }
    }
}
