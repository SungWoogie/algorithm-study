package programmers;

import java.util.stream.IntStream;

// Lv0 - 나이 출력
public class P230504 {
    public static int solution(int age) {
        /* 일반 코드
        int answer = 1;
        int defaultBirth = 2022;
        answer += defaultBirth - age;
        return answer;
         */

        int defaultBirth = 2022;
        return IntStream.of(defaultBirth, age)
                .reduce((x, y) -> x - y + 1)
                .getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(solution(40));
        System.out.println(solution(23));
    }
}
