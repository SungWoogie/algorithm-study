package programmers;

import java.util.*;

// 배열 회전 시키기
public class P230522_2 {
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        Deque<Integer> deque = new LinkedList<>();
        for (int n : numbers) {
            deque.offer(n);
        }
        if (direction.equals("right")) {
            deque.offerFirst(deque.pollLast());
        } else if (direction.equals("left")) {
            deque.offerLast(deque.pollFirst());
        }
        int i = 0;
        while (!deque.isEmpty()){
            answer[i] = deque.pollFirst();
            i++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3,}, "right"))); // 3,1,2
        System.out.println(Arrays.toString(solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left")));//455, 6, 4, -1, 45, 6, 4
    }
}
