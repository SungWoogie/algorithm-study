package zerobase;

import java.text.DecimalFormat;
import java.util.*;
// 사칙연산 순으로 계산
public class PreCodingTest_2_3_3 {
    public static double solution(String s) {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                StringBuilder numBuilder = new StringBuilder();
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    numBuilder.append(s.charAt(i));
                    i++;
                }
                double number = Double.parseDouble(numBuilder.toString());
                numbers.push(number);
                i--;
            } else if (isOperator(ch)) {
                while (!operators.isEmpty() && hasPrecedence(ch, operators.peek())) {
                    double result = applyOperation(operators.pop(), numbers.pop(), numbers.pop());
                    numbers.push(result);
                }
                operators.push(ch);
            }
        }

        while (!operators.isEmpty()) {
            double result = applyOperation(operators.pop(), numbers.pop(), numbers.pop());
            numbers.push(result);
        }

        double result = numbers.pop();
        result = Math.floor(result * 100) / 100;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return Double.parseDouble(decimalFormat.format(result));
    }

    public static boolean hasPrecedence(char op1, char op2) {
        return (op1 != '*' && op1 != '/') || (op2 != '+' && op2 != '-');
    }

    public static double applyOperation(char operator, double b, double a) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }
        throw new IllegalArgumentException("유효하지 않은 연산자입니다.");
    }

    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    public static void main(String[] args) {
        System.out.println(solution("2*3+5/6*3+15")); // 23.50
        System.out.println(solution("10/3")); // 3.33
    }
}
