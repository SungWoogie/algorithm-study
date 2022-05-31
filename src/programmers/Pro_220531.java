package programmers;

import java.util.ArrayList;
import java.util.List;

public class Pro_220531 {   // 없는 숫자 더하기
    public static void main(String[] args) {
        int[] numbers = {5, 8, 4, 0, 6, 7, 9};
        System.out.println(solution(numbers));

    }

    public static int solution(int[] numbers) {
        int answer = 0;

        List<Integer> list = new ArrayList<>(); // contains 메소드 사용하기 위해
        for (int n : numbers) { // list 에 값 저장
            list.add(n);
        }

        for (int i = 1; i <= 9; i++) {  // 1~9까지 해당 값이 있는지 확인
            if (!list.contains(i)) {    // 없으면 answer 에 값 더하기
                answer += i;
            }
        }

        return answer;
    }
}
