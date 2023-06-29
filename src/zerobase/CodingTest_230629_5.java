package zerobase;

import java.util.*;
// 틀림
public class CodingTest_230629_5 {
    public static List<List<Integer>> solution(int[][] buildings) {
        List<List<Integer>> silhouettePoints = new ArrayList<>();

        // 건물의 좌우측 x 좌표를 기준으로 정렬
        Arrays.sort(buildings, Comparator.comparingInt(a -> a[0]));

        // 건물의 실루엣을 구하기 위한 우선순위 큐
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(Comparator.comparingInt((int[] a) -> a[1]).reversed());

        // 가장 높은 건물을 저장하는 변수
        int maxHeight = 0;

        for (int[] building : buildings) {
            int left = building[0];
            int right = building[1];
            int height = building[2];

            // 현재 건물의 시작점에 해당하는 x 좌표의 실루엣을 구함
            while (!maxHeap.isEmpty() && maxHeap.peek()[1] <= left) {
                int[] removed = maxHeap.poll();
                if (removed[1] <= maxHeight) {
                    List<Integer> point = new ArrayList<>();
                    point.add(removed[1]);
                    point.add(removed[0]);
                    silhouettePoints.add(point);
                }
            }

            // 현재 건물을 우선순위 큐에 추가
            maxHeap.offer(new int[]{height, right});

            // 현재 건물의 높이가 이전에 저장한 최대 높이보다 큰 경우
            if (height > maxHeight) {
                List<Integer> point = new ArrayList<>();
                point.add(left);
                point.add(height);
                silhouettePoints.add(point);
                maxHeight = height;
            }
        }

        // 나머지 실루엣을 구함
        while (!maxHeap.isEmpty()) {
            int[] removed = maxHeap.poll();
            if (removed[1] <= maxHeight) {
                List<Integer> point = new ArrayList<>();
                point.add(removed[1]);
                point.add(removed[0]);
                silhouettePoints.add(point);
            }
        }

        return silhouettePoints;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new List[]{solution(new int[][]{
                {1, 8, 4},
                {2, 4, 10},
                {3, 5, 6},
                {10, 12, 6}})}));
        /*
        {{1,4},{2,10},{4,6},{5,4},{8,0},{10,6},{12,0}}
         */
    }
}
