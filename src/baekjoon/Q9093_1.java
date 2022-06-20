package baekjoon;

import java.util.Scanner;

public class Q9093_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            String[] strings = str.split(" ");

            for (int j = 0; j < strings.length; j++) {
                StringBuilder sb = new StringBuilder();
                sb.append(strings[j]);
                sb.reverse();
                strings[j] = String.valueOf(sb);
            }
            for (String s : strings) {
                System.out.print(s + " ");
            }
        }
    }
}
