package zerobase;

import java.util.ArrayList;
import java.util.List;

// 연속된 정수의 합 n 이 되는 경우의 수
public class PreCodingTest_3_5_1 {
    public static int solution(int n) {
        List<List<Integer>> result = new ArrayList<>();
        int sum = 0;
        int start = 1;
        int end = 1;

        while (start <= n / 2) {
            if (sum < n) {
                sum += end;
                end++;
            } else if (sum > n) {
                sum -= start;
                start++;
            } else {
                List<Integer> sequence = new ArrayList<>();
                for (int i = start; i < end; i++) {
                    sequence.add(i);
                }
                result.add(sequence);
                sum -= start;
                start++;
            }
        }

        return result.size() + 1; // 자기 자신을 포함한 경우
    }

    public static void main(String[] args) {
        System.out.println(solution(15)); // 4
    }
}

