package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pro_220518 {   // 같은 숫자는 싫어

    public static int[] solution(int[] arr) {
        int[] answer;
        int temNum = -1;
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (temNum != i) {
                temNum = i;
                list.add(temNum);
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 4, 4, 3, 3};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
