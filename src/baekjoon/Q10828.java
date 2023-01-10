package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Q10828 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = scanner.nextInt();

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            switch (str) {
                case "push":
                    stack.push(scanner.next());
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.peek()).append("\n");

                    }
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if (stack.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }

                    break;
            }
        }
        System.out.println(sb);
    }
}

