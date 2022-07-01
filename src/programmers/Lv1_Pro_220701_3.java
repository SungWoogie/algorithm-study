package programmers;

import java.util.*;

public class Lv1_Pro_220701_3 { // 두개 뽑아서 더하기
    public List<Integer> solution(int[] numbers) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    set.add(numbers[i] + numbers[j]);
                }
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        return list;
    }


    public static void main(String[] args) {
        int[] numbers = {5, 0, 2, 7};
        Lv1_Pro_220701_3 s = new Lv1_Pro_220701_3();

        System.out.println(s.solution(numbers));
    }
}
