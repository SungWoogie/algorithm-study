package programmers;

import java.util.stream.IntStream;

// Lv 0 두수의 나눗셈 (복습)
public class P230427_2 {
    public static void main(String[] args) {
        System.out.println(solution(3, 2));
        System.out.println(solution(7, 3));
        System.out.println(solution(1, 16));
    }

    public static int solution(int num1, int num2) {
        double stream = IntStream.of(num1, num2)
                .mapToDouble(Double::valueOf)
                .reduce((x, y) -> x / y * 1000)
                .orElse(0.0);
        return (int) Math.floor(stream);
    }
}
