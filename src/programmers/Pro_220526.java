package programmers;

import java.util.*;

public class Pro_220526 {   // 두 개 뽑아서 더하기
    public static void main(String[] args) {
        int[] arr = new int[]{5, 0, 2, 7};
        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] numbers) {
        Set<Integer> set = new LinkedHashSet<>();   // 중복 값을 넣지 않기 위해 셋 사용

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) { // i 와 j 가 같지 않으면 더해서 셋에 저장
                    set.add(numbers[i] + numbers[j]);
                }
            }
        }
        List<Integer> list = new ArrayList<>(set); // 리스트 오름차순 정렬하기 위해 list 에 set 저장
        Collections.sort(list);

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
