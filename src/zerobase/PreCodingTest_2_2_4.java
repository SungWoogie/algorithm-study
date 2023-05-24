package zerobase;

import java.util.*;
// 중복된 숫자 제거후 반환 (Set)
public class PreCodingTest_2_2_4 {
    public static int solution(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                set.remove(num);
            }
        }
        if (set.isEmpty()) {
            return 0;
        } else {
            return set.iterator().next();
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 1})); // 2
        System.out.println(solution(new int[]{44, 22, 33, 22, 44, 33})); // 0
    }
}