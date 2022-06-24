package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Q4949_1 { // 균형잡힌 세상
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Stack<Character> stack = new Stack<>();
            String str = scanner.nextLine();

            if (str.equals(".")) {
                break;
            }

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' || str.charAt(i) == '[') {
                    stack.push(str.charAt(i));
                } else {
                    if (stack.isEmpty() || (stack.peek() == '(' && str.charAt(i) == ']') ||
                            (stack.peek() == '[' && str.charAt(i) == ')')) {
                        stack.push(str.charAt(i));
                        break;
                    }
                    if (!stack.isEmpty()) {
                        if (stack.peek() == '(' && str.charAt(i) == ')' || stack.peek() == '[' && str.charAt(i) == ']') {
                            stack.pop();
                        }
                    }
                }
            }
            if (stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
