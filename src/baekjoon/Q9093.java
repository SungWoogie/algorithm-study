package baekjoon;

import java.util.*;

public class Q9093 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            String[] splits = str.split(" ");

            for (String s : splits) {
                StringBuilder sb = new StringBuilder(s);
                answer.append(sb.reverse()).append(" ");
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }
}
