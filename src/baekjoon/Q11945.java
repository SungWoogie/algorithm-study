package baekjoon;

import java.util.Scanner;

public class Q11945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] n = scanner.nextLine().split(" ");

        int num = Integer.parseInt(n[0]);
        int num2 = Integer.parseInt(n[1]);

        for (int i = 0; i < num; i++) {
            String str = scanner.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < num2; j++) {
                sb.append(str.charAt(j));
            }
            String reverseStr = sb.reverse().toString();
            System.out.println(reverseStr);
        }
    }
}
