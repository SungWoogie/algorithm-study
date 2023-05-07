package programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

// Lv0 배열 뒤집기
public class P230507 {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        // 일반코드
        int idx = 0;
        for (int i = num_list.length; i > 0; i--) {
            answer[idx] = num_list[i - 1];
            idx++;
        }

        // 스트림
        int[] stream = IntStream.range(0, num_list.length) // 0부터 num_list 배열의 길이까지 포함하지 않는 숫자 스트림이 생성
                .map(i -> num_list[num_list.length - i - 1]) // 각 숫자를 가져와서 num_list 배열의 해당 요소에 매핑하지만 역순이다.
                // i -> num_list[num_list.length - i - 1] 부분은 "숫자 i를 가져와 num_list 에서 num_list.length - i - 1 위치에 있는 요소를 찾는다.
                .toArray(); // 배열로 다시 할당

        return stream;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 1, 1, 1, 2})));
        System.out.println(Arrays.toString(solution(new int[]{1, 0, 1, 1, 1, 3, 5})));
    }
}
