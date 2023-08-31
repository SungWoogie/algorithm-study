package zerobase;

import java.util.Arrays;

public class CodingTest_230831_2 {
    public static int solution(int[] arr, int target) {
        Arrays.sort(arr);

        int closestSum = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                int diff = Math.abs(target - sum);

                if (diff < minDiff || (diff == minDiff && sum < closestSum)) {
                    minDiff = diff;
                    closestSum = sum;
                }

                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{5,2,15,3,10,12}, 21)); // 20
    }

}
