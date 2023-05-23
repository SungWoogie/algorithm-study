package zerobase;

import java.util.*;

// 두개 배열 중복되는 값 출력하기
public class PreCodingTest_2_1_5 {
    public static int[] solution(int[] arr1, int[] arr2) {

        Set<Integer> set = new HashSet<>();
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j) {
                    set.add(i);
                }
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 7, 8, 4}, new int[]{2, 4, 6, 8}))); // {4,8}
        System.out.println(Arrays.toString(solution(new int[]{9, 1, 1, 4, 1, 2, 3, 4}, new int[]{5, 6, 10, 12}))); // {}
    }
}
