package zerobase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 배열의 숫자를 2개씩 뽑아서 K 번째로 높은 값 찾기
public class PreCodingTest_2_4_2 {
    public static int solution(int[] A, int K) {
        int answer = 0;

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i != j) {
                    numbers.add(A[i] * 10 + A[j]);
                }
            }
        }
        Collections.sort(numbers);
        answer = numbers.get(numbers.size() - K);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}, 2)); // 54
    }
}

