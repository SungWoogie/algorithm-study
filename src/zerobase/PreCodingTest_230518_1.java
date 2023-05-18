package zerobase;

import java.util.Stack;

public class PreCodingTest_230518_1 {
    public static String solution(String s) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (!stack.isEmpty() && currentChar == stack.peek()) {
                stack.pop();
            } else {
                stack.push(currentChar);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : stack) {
            stringBuilder.append(c);
        }
        answer = stringBuilder.toString();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("aacddefg"));
    }

}
