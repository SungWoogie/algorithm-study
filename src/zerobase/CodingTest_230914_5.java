package zerobase;

import java.util.Arrays;
// X
public class CodingTest_230914_5 {
    public static int solution(int[] nums) {
        int n = nums.length / 3;
        int len = nums.length;

        if (len % 3 != 0) {
            return -1;
        }

        Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            minDiff = Math.min(minDiff, nums[i + len - n] - nums[i]);
        }

        return minDiff;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{7, 9, 5, 8, 1, 3}));// 3
    }

}
