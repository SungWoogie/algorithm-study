package zerobase;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 나온 숫자 카운트 세기
public class PreCodingTest_3_1_1 {
    public static boolean solution(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Set<Integer> valueSet = new HashSet<>(map.values());
        return map.size() == valueSet.size();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 5, 4, 3, 1, 1})); // false
        System.out.println(solution(new int[]{1, 2, 2, 3, 3, 3, 4, 4, 4, 4})); // true
    }

}

