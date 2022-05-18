package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pro_220518 {   // 같은 숫자는 싫어

    public static int[] solution(int[] arr) {
        int[] answer;   // 리턴할 배열 생성
        int temNum = -1;    // 값이 0이 들어갈 수도 있으므로 -1 로 지정
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (temNum != i) {  // 배열안에 값이 위에 변수랑 같지 않으면 임시 변수안에 저장하고
                temNum = i;     // 리스트에 값 저장
                list.add(temNum);
            }
        }
        answer = new int[list.size()];  // 리스트에 저장된 개수 만큼 리턴할 배열 사이즈 지정하고
        for (int i = 0; i < answer.length; i++) {   // 리스트에 있는 값 배열로 저장
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 4, 4, 3, 3};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
