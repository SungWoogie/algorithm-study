package zerobase;

import java.util.Deque;
import java.util.LinkedList;

public class PreCodingTest_2_3_5 {
    public static int solution(int N, int K) {
        Deque<Integer> circle = new LinkedList<>();

        // 1부터 N 까지의 추가합니다.
        for (int i = 1; i <= N; i++) {
            circle.add(i);
        }

        while (circle.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                circle.addLast(circle.pollFirst());
            }
            circle.pollFirst();
        }
        return circle.getFirst();
    }

    public static void main(String[] args) {
        System.out.println(solution(7, 3)); // 4
    }
}

