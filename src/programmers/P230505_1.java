package programmers;

import java.util.stream.IntStream;

// Lv0 짝수의 합
public class P230505_1 {
    public static int solution(int n) {
        int answer = 0;

        // 일반 코드
//        for (int i = 0; i <= n; i++) {
//            if (i % 2 == 0) {
//                answer += i;
//            }
//        }

        // 스트림
        answer = IntStream.rangeClosed(0, n) // 스트림을 만들고
                .filter(i -> i % 2 == 0) // 중간연산
                .sum(); // 최종연산

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(4));
    }
}
