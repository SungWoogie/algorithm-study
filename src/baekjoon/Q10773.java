package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Q10773 { // 제로
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

        int sum = 0;
        for (int a : stack) {
            sum += a;
        }
        System.out.println(sum);
    }
}
