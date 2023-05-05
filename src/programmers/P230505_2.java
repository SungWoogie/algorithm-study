package programmers;

import java.util.Arrays;
// 배열의 평균 값
public class P230505_2 {
    public static double solution(int[] numbers) {
        double answer = 0;

        // 일반코드
        for (int number : numbers) {
            answer += number;
        }
        answer = answer / numbers.length;

        // 스트림
        answer = Arrays.stream(numbers)
                .average()
                .orElse(Double.NaN);
        return answer;

    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    }
}
