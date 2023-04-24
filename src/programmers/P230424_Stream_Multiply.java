package programmers;

import java.util.stream.Stream;

public class P230424_Stream_Multiply {
    public static void main(String[] args) {
        System.out.println(solution(2, 3));
    }

    public static int solution(int num1, int num2) {
        Integer stream = Stream.of(num1, num2)
                .reduce(1, (a, b) -> a * b);
        return stream;
        /*
        줄인 코드
        return Stream.of(num1, num2)
                .reduce(1, (a, b) -> a * b);
         */

    }
}