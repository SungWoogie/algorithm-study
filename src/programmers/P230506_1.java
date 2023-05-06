package programmers;

import java.util.stream.IntStream;

// Lv0 양꼬치
public class P230506_1 {
    public static int solution(int n, int k) {
        int answer = 0;
        // 10인분이면 음료 1개 공짜
        // 양꼬치 1개 12_000
        // 음료 1개 2_000

        // 일반코드
        int freeCount = (n / 10) * 2_000;
        int sheepSkewers = n * 12_000;
        int drink = k * 2_000 - freeCount;
        answer = sheepSkewers + drink;

        // 람다스트림
        freeCount = IntStream.of(n)
                .map(i -> (i / 10) * 2_000)
                .findFirst()
                .orElse(0);

        int result = freeCount;

        sheepSkewers = IntStream.of(n)
                .map(i -> i * 12000)
                .findFirst()
                .orElse(0);
        drink = IntStream.of(k).map(i -> (i * 2_000) - result).findFirst().orElse(0);

        answer = sheepSkewers + drink;


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 3)); // 124_000
        System.out.println(solution(64, 6)); // 768_000
    }
}
