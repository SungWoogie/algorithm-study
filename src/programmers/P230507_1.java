package programmers;

import java.util.stream.IntStream;

// Lv0 순서쌍의 개수
public class P230507_1 {
    public static int solution(int n) {
        int answer = 0;

        // 일반코드
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer++;
            }
        }

        // 스트림
        answer = (int) IntStream.rangeClosed(1, n)
                .filter(i -> n % i == 0)
                .count();

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(20)); // 6
        System.out.println(solution(100)); // 9
    }
}
