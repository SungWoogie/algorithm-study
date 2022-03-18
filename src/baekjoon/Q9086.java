package baekjoon;

import java.util.Scanner;

public class Q9086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String str = scanner.next();
            char[] ch = str.toCharArray();

            if (ch.length != 1) {
                System.out.println(ch[0] + "" + ch[ch.length - 1]);
            } else {
                System.out.println(ch[0] + "" + ch[0]);
            }
        }
    }
}
