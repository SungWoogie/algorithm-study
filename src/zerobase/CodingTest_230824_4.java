package zerobase;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class CodingTest_230824_4 {
    public static double[] solution(int[] arr, int k) {
        double[] result = new double[arr.length - k + 1];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            if (!maxHeap.isEmpty() && arr[i] <= maxHeap.peek()) {
                maxHeap.offer(arr[i]);
            } else {
                minHeap.offer(arr[i]);
            }

            if (i >= k) {
                if (arr[i - k] <= maxHeap.peek()) {
                    maxHeap.remove(arr[i - k]);
                } else {
                    minHeap.remove(arr[i - k]);
                }
            }

            while (maxHeap.size() > minHeap.size()) {
                minHeap.offer(maxHeap.poll());
            }
            while (minHeap.size() > maxHeap.size() + 1) {
                maxHeap.offer(minHeap.poll());
            }

            if (i >= k - 1) {
                if (k % 2 == 1) {
                    result[i - k + 1] = minHeap.peek();
                } else {
                    result[i - k + 1] = (double) (minHeap.peek() + maxHeap.peek()) / 2.0;
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 2, 6, 4, 2, 3}, 3)));
    }

}
