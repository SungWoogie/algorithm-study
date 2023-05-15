package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// 짝수는 싫어요
public class P230534 {
    public static int[] solution(int n) {
        int[] answer;

        // 일반코드
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                list.add(i);
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        // Stream 으로 변형하기
        int[] stream = IntStream.rangeClosed(1, n).filter(i -> i % 2 != 0).toArray();
        System.out.println("Stream : " + Arrays.toString(stream));


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10))); // [1, 3, 5, 7, 9]
        System.out.println(Arrays.toString(solution(15))); // [1, 3, 5, 7, 9, 11, 13, 15]

    }
}
