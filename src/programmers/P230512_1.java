package programmers;

import java.util.*;

// 프로세스
public class P230512_1 {
    public static int solution(int[] priorities, int location) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        for (int i : priorities) {
            list.add(i);
        }
        list.sort(Collections.reverseOrder());

        Queue<Integer> queue = new LinkedList<>(list);

        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                Integer getNumber = queue.peek();
                if (getNumber != null && priorities[i] == getNumber) {
                    if (i == location) {
                        answer++;
                        return answer;
                    }
                    queue.poll();
                    answer++;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2)); // 1
        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0)); // 5
    }
}
