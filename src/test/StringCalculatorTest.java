package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;

public class StringCalculatorTest {

    private static final String DIVIDE_BY_BLANK = " ";
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> formulas = divideFormulaByBlank(InputCalculateFormula());
        List<String> symbols = findSymbols(formulas); // 문자 저장소
        List<Long> numbers = findNumbers(formulas, symbols); // 숫자 저장소
        printResult(numbers, symbols);
    }

    public static String InputCalculateFormula() {
        System.out.println("계산할 수식을 입력해 주세요.");
        return SCANNER.nextLine();
    }

    public static List<String> divideFormulaByBlank(String formula) {
        return new ArrayList<>(List.of(formula.split(DIVIDE_BY_BLANK)));
    }

    public static List<String> findSymbols(List<String> formulas) {
        List<String> symbols = new ArrayList<>();
        for (String formula : formulas) {
            for (Operator operator : Operator.values()) {
                if (formula.equals(operator.getSymbol())) {
                    symbols.add(formula);
                }
            }
        }
        return symbols;
    }

    public static List<Long> findNumbers(List<String> formulas, List<String> symbols) {
        for (int i = 0; i < formulas.size(); i++) {
            for (String symbol : symbols) {
                if (formulas.get(i).equals(symbol)) {
                    formulas.remove(i);
                }
            }
        }
        return changeNumberType(formulas);
    }

    public static List<Long> changeNumberType(List<String> tempNumbers) {
        List<Long> numbers = new ArrayList<>();
        for (String number : tempNumbers) {
            numbers.add(Long.parseLong(number));
        }
        return numbers;
    }

    public static void printResult(List<Long> numbers, List<String> symbols) {
        long firstNumber = numbers.get(0);
        for (int i = 0; i < symbols.size(); i++) {
            long secondNumber = numbers.get(i + 1);
            if (symbols.get(i).equals(Operator.PLUS.getSymbol())) {
                firstNumber = Operator.PLUS.calculate(firstNumber, secondNumber);
            } else if (symbols.get(i).equals(Operator.MINUS.getSymbol())) {
                firstNumber = Operator.MINUS.calculate(firstNumber, secondNumber);
            } else if (symbols.get(i).equals(Operator.MULTIPLY.getSymbol())) {
                firstNumber = Operator.MULTIPLY.calculate(firstNumber, secondNumber);
            } else if (symbols.get(i).equals(Operator.DIVIDE.getSymbol())) {
                firstNumber = Operator.DIVIDE.calculate(firstNumber, secondNumber);
            }
        }
        System.out.println(firstNumber);
    }


    enum Operator {
        PLUS("+", Long::sum),
        MINUS("-", (firstNumber, secondNumber) -> firstNumber - secondNumber),
        MULTIPLY("*", (firstNumber, secondNumber) -> firstNumber * secondNumber),
        DIVIDE("/", (firstNumber, secondNumber) -> firstNumber / secondNumber);

        private final String symbol;
        private final BiFunction<Long, Long, Long> expression;

        Operator(String symbol, BiFunction<Long, Long, Long> expression) {
            this.symbol = symbol;
            this.expression = expression;
        }

        public long calculate(long firstNumber, long secondNumber) {
            return expression.apply(firstNumber, secondNumber);
        }

        public String getSymbol() {
            return symbol;
        }
    }

}