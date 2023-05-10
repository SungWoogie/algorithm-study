package programmers;

import java.util.*;

// Lv2 Queue 기능개발
public class P230510 {
    public static int[] solution(int[] progresses, int[] speeds) { // 93 30 55
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) { // 일 수 계산해서 저장해 놓기
            int calculateDay = 100 - progresses[i]; // 45
            int days = calculateDay / speeds[i]; // 9
            if (calculateDay % speeds[i] != 0) {
                days += 1;
            }
            queue.offer(days);
        }

        List<Integer> result = new ArrayList<>();

        int count = 0;
        int prev = -1;
        while (!queue.isEmpty()) { // 값을 하나씩 꺼내서 사이즈가 비어있지 않을 때 까지 반복
            int current = queue.poll(); // 값을 하나 꺼낸다.
            if (current > prev) {
                if (prev != -1) {
                    result.add(count);
                }
                count = 1;
                prev = current;
            } else {
                count++;
            }
        }
        result.add(count);

        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        // r = 2 1
        System.out.println(Arrays.toString(solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
        // r = 1 3 2
        System.out.println(Arrays.toString(solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1,})));
    }
}
