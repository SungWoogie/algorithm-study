package zerobase;

import java.util.Collections;
import java.util.PriorityQueue;

public class CT_18_1 {
    public static int solution(int[] food) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : food) {
            pq.add(i);
        }
        int feedTimes = 0;
        while (!pq.isEmpty()) {
            int first = pq.poll();
            feedTimes++;

            if (!pq.isEmpty()) {
                int second = pq.poll();
                if (first > 1) {
                    pq.add(first - 1);
                }

                if (second > 1) {
                    pq.add(second - 1);
                }
            } else if (first > 1) {
                pq.add(first - 1);
            }
        }
        return feedTimes;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{6, 3, 4, 5}));
    }

}
