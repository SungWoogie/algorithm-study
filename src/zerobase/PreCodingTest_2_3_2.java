package zerobase;

import java.util.*;

public class PreCodingTest_2_3_2 {
    public static int[] solution(int[] nums) {
        List<String> list = new ArrayList<>();
        for (int num : nums) {
            list.add(String.valueOf(num));
        }
        int count = 0;
        List<Integer> integers = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) { // 없는 숫자 찾아서 integers 배열에 저장
            if (!list.contains(String.valueOf(i))) {
                integers.add(i);
                count++;
            }
        }
        int[] answer = new int[count]; //
        for (int i = 0; i < answer.length; i++) {
            answer[i] = integers.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 6, 6, 6}))); // {5,7}
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 4, 8}))); // {2}
    }
}