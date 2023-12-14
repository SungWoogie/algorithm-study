package zerobase;

import java.util.Arrays;

public class CT_15_2 {
    private static int solution(int[] buckets, int m) {
        Arrays.sort(buckets); // 위치 정렬

        int n = buckets.length;
        int left = 0, right = buckets[n - 1] - buckets[0];

        while (left < right) {
            int mid = (left + right) / 2;

            if (check(buckets, m, mid)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left - 1;
    }

    private static boolean check(int[] buckets, int m, int minDistance) {
        int count = 1;
        int lastPlaced = buckets[0];

        for (int i = 1; i < buckets.length; i++) {
            if (buckets[i] - lastPlaced >= minDistance) {
                count++;
                lastPlaced = buckets[i];
            }
        }
        return count >= m;
    }

    public static void main(String[] args) {
        int[] buckets = {1, 2, 3, 4, 7};
        int m = 3;
        System.out.println(solution(buckets, m)); // 출력 결과: 3
    }

}
