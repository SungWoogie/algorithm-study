package programmers;

import java.util.stream.Stream;

public class P230424_Stream_divide {
    public static void main(String[] args) {
        System.out.println(solution(10, 5));
    }

    public static int solution(int num1, int num2) {
        return Stream.of(num1, num2)
                .reduce((a, b) -> {
                    if (b == 0) {
                        throw new ArithmeticException("division by zero");
                    }
                    return a / b;
                })
                .orElse(0);
    }
}