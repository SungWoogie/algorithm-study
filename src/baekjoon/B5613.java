package baekjoon;

import java.util.Scanner;

// 계산기 프로그램
public class B5613 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = scanner.nextInt();

        while (true) {
            String operator = scanner.next();
            if (operator.equals("=")) {
                break;
            }

            int number = scanner.nextInt();

            switch (operator) {
                case "+":
                    result += number;
                    break;
                case "-":
                    result -= number;
                    break;
                case "*":
                    result *= number;
                    break;
                case "/":
                    result /= number;
                    break;
            }
        }

        System.out.println(result);
    }
}