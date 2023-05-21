package zerobase;

import java.util.Stack;

public class PreCodingTest_1_5_3 {
    public static String solution(String s) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        answer = stringBuilder.toString();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("apple")); // true
    }

}
