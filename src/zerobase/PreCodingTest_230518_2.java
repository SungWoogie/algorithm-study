package zerobase;

import java.util.Stack;

public class PreCodingTest_230518_2 {
    public static int solution(String S) { //       (()){[<>]}
        Stack<Character> stack = new Stack<>();// ((
        for (int i = 0; i < S.length(); i++) { // 2
            char currentChar = S.charAt(i); // )
            if (currentChar == '(' || currentChar == '{' || currentChar == '[' || currentChar == '<') {
                stack.push(S.charAt(i));
            } else if (currentChar == ')' || currentChar == '}' || currentChar == ']' || currentChar == '>') {
                if (stack.isEmpty()) {
                    return 0;
                }
                char top = stack.pop();
                if ((currentChar == ')' && top != '(') || (currentChar == '}' && top != '{') ||
                        (currentChar == ']' && top != '[') || (currentChar == '>' && top != '<')) {
                    return 0;
                }
            }
        }
        if (!stack.isEmpty()) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(solution("(()){[<>]}"));
        System.out.println(solution("({)}[<]>"));
    }

}

