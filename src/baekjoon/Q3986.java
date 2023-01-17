package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Q3986 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            Stack<Character> stack = new Stack<>();
            stack.push(input.charAt(0));
            for (int j = 1; j < input.length(); j++) {
                if (!stack.isEmpty()) {
                    if (stack.peek().equals(input.charAt(j))) {
                        stack.pop();
                        continue;
                    }
                }
                stack.push(input.charAt(j));
            }
            if (stack.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
