package programmers;

import java.util.stream.Stream;

public class P230425_Stream_division {
    public static void main(String[] args) {
        System.out.println(solution(1, 16));
        System.out.println(solution1(7, 3));
    }

    public static int solution(int num1, int num2) {
        double stream = Stream.of(num1, num2)
                .mapToDouble(Double::valueOf)
                .reduce((a, b) -> a / b * 1000)
                .orElse(0.0);
        return (int) Math.floor(stream);
    }

    public static int solution1(int num1, int num2) {
        System.out.println("=== 일반적인 코드 ===");
        double num = (double) num1 / num2 * 1000;
        return (int) num;
    }

}