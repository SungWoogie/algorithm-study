package programmers;

import java.util.stream.IntStream;

public class P230425_Stream_Sum {
    public static void main(String[] args) {
        System.out.println(solution(10, 2));
    }

    public static int solution(int num1, int num2) {
        return IntStream.of(num1, num2).sum();
    }
}