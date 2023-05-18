package zerobase;

import java.util.Stack;

public class PreCodingTest_230518_3 {
    public static int solution(String S) {
        Stack<Character> stack = new Stack<>(); // A

        for (int i = 0; i < S.length(); i++) { // 2
            char currentChar = S.charAt(i); // B
            if (!stack.isEmpty() && currentChar == stack.peek()) {
                stack.pop();
            } else {
                stack.push(currentChar);
            }
        }
        if (stack.isEmpty()) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("ABBA"));
    }

}
