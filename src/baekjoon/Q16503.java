package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q16503 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputValue = new ArrayList<>(List.of(scanner.nextLine().split(" ")));
        List<String> initialOperators = List.of("+", "-", "/", "*"); // 연산자 list

        List<Integer> numbers = new ArrayList<>(); // 2 3 4
        List<String> operators = new ArrayList<>(); // + *

        for (String input : inputValue) { // 연산자 찾기
            if (initialOperators.contains(input)) {
                operators.add(input);
            }
        }
        if (operators.size() == 1) {
            switch (operators.get(0)) {
                case "+":
                    operators.add("+");
                    break;
                case "-":
                    operators.add("-");
                    break;
                case "*":
                    operators.add("*");
                    break;
                default:
                    operators.add("/");
                    break;
            }
        }

        for (String s : inputValue) { // 숫자 찾기
            if (!operators.contains(s)) {
                numbers.add(Integer.parseInt(s));
            }
        }

        List<Integer> scores = new ArrayList<>();
        int firstCalculate = 0; // 첫번째 계산
        switch (operators.get(0)) {
            case "+":
                firstCalculate = numbers.get(0) + numbers.get(1);
                break;
            case "-":
                firstCalculate = numbers.get(0) - numbers.get(1);
                break;
            case "/":
                firstCalculate = numbers.get(0) / numbers.get(1);
                break;
            default:
                firstCalculate = numbers.get(0) * numbers.get(1);
                break;
        }
        int totalCalculate = 0;
        switch (operators.get(1)) {
            case "+":
                totalCalculate = firstCalculate + numbers.get(2);
                break;
            case "-":
                totalCalculate = firstCalculate - numbers.get(2);
                break;
            case "/":
                totalCalculate = firstCalculate / numbers.get(2);
                break;
            default:
                totalCalculate = firstCalculate * numbers.get(2);
                break;
        }
        scores.add(totalCalculate);
        firstCalculate = 0;
        totalCalculate = 0;

        switch (operators.get(1)) { // 두번째 계산
            case "+":
                firstCalculate = numbers.get(1) + numbers.get(2);
                break;
            case "-":
                firstCalculate = numbers.get(1) - numbers.get(2);
                break;
            case "/":
                firstCalculate = numbers.get(1) / numbers.get(2);
                break;
            default:
                firstCalculate = numbers.get(1) * numbers.get(2);
                break;
        }

        switch (operators.get(0)) {
            case "+":
                totalCalculate = numbers.get(0) + firstCalculate;
                break;
            case "-":
                totalCalculate = numbers.get(0) - firstCalculate;
                break;
            case "/":
                totalCalculate = numbers.get(0) / firstCalculate;
                break;
            default:
                totalCalculate = numbers.get(0) * firstCalculate;
                break;
        }
        scores.add(totalCalculate);
        Collections.sort(scores);
        System.out.println(scores.get(0));
        System.out.println(scores.get(1));
    }
}
