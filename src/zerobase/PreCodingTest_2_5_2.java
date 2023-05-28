package zerobase;

import java.util.ArrayList;
import java.util.List;

// 같은 숫자중 제일 작은 idx 찾기
public class PreCodingTest_2_5_2 {
    public static int solution(int[] nums, int n) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        if (!list.contains(n)) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,3,3}, 3)); // 1
        System.out.println(solution(new int[]{1, 3, 5, 3, 2}, 3)); // 1
        System.out.println(solution(new int[]{2, 5, 8, 0}, 3)); // -1
    }
}
