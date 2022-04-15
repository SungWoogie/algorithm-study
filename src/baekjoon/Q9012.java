package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Q9012 {

    public static void result(String text) {
        Stack<Character> stack = new Stack<>();

        int i = 0;
        while (i < text.length()) {
            char ch = text.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.size() < 1) {
                    System.out.println("NO");
                    return;
                }
                stack.pop();
            }
            i++;
        }
        if (stack.size() > 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            result(scanner.next());
        }
    }
}