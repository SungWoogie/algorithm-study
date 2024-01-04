package zerobase;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class CT_18_2 {
    public static int solution(int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        Set<Long> seen = new HashSet<>();

        int[] factors = {2, 3, 5};
        long ugly = 1;

        for (int factor : factors) {
            pq.add((long) factor);
            seen.add((long) factor);
        }

        for (int i = 1; i < n; i++) {
            ugly = pq.poll();
            for (int factor : factors) {
                long next = ugly * factor;
                if (!seen.contains(next)) {
                    pq.add(next);
                    seen.add(next);
                }
            }
        }

        return (int) ugly;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }

}
