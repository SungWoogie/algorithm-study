package zerobase;

import java.util.Arrays;
// X
public class CodingTest_230914_2 {
    public static int solution(int[] buckets, int m) {
        Arrays.sort(buckets);

        int n = buckets.length;
        int left = 1;
        int right = buckets[n - 1] - buckets[0];

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canPlace(buckets, m, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private static boolean canPlace(int[] buckets, int m, int distance) {
        int count = 1;
        int prevPosition = buckets[0];

        for (int i = 1; i < buckets.length; i++) {
            if (buckets[i] - prevPosition >= distance) {
                count++;
                prevPosition = buckets[i];

                if (count >= m) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 7}, 3)); // 3
    }

}
