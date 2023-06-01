package zerobase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// n 이상의 가장 작은 정수 찾기
public class PreCodingTest_3_3_1 {
    public static int solution(int[] arr, int n) {
        long answer = 0;

        if (arr.length == 0) {
            return -1;
        }

        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num >= n) {
                list.add(num);
            }
        }

        if (list.isEmpty()) {
            return -1;
        }

        Collections.sort(list);
        answer = list.get(0);
        return (int) answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 6, 10}, 6)); // 6
        System.out.println(solution(new int[]{10, 50, 20, 44}, 9)); // 10
    }
}

