package baekjoon;

import java.util.*;

public class Q10773_1 { // 제로
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < testCase; i++) {
            int num = scanner.nextInt();
            if (num != 0) {
                stack.push(num);
            } else {
                stack.pop();
            }
        }
        int result = 0;
        for (int a : stack) {
            result += a;
        }
        System.out.println(result);
    }
}
