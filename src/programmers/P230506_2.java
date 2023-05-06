package programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

// Lv0 배열 자르기
public class P230506_2 {
    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};

        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);

        // 스트림
        int[] stream = IntStream.rangeClosed(num1, num2)
                .map(i -> numbers[i])
                .toArray();

        return stream;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}, 1, 3)));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 5}, 1, 2)));
    }
}
