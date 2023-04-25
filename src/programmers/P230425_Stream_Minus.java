package programmers;

import java.util.stream.IntStream;

public class P230425_Stream_Minus {
    public static void main(String[] args) {
        System.out.println(solution(8, 2));
    }

    public static int solution(int num1, int num2) {
        return IntStream.of(num1, num2)
                .reduce((a, b) -> a - b)
                .getAsInt();
    }
}