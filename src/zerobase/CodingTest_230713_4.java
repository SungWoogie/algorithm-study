package zerobase;

import java.util.*;

public class CodingTest_230713_4 {
    public static int[] solution(int[] arr, int k) {

        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            // 윈도우의 범위를 벗어나는 값 제거
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // 현재 값보다 작은 값들 제거
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.pollLast();
            }

            // 현재 값을 덱에 추가
            deque.offerLast(i);

            // 최댓값을 결과 리스트에 추가
            if (i >= k - 1) {
                result.add(arr[deque.peekFirst()]);
            }
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 2, 6, 4, 2, 3}, 3))); // 6,6,6,4
    }

}
