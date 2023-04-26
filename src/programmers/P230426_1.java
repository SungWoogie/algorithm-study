package programmers;

import java.util.Arrays;

public class P230426_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));
        System.out.println(Arrays.toString(solution("foobar")));

    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (i != 0) {
                int index = s.substring(0, i).lastIndexOf(s.charAt(i));
                if (index != -1) {
                    answer[i] = i - index;
                } else {
                    answer[i] = index;
                }
            } else { // 첫번째 값은 -1로 처리
                answer[i] = -1;
            }
        }
        return answer;
    }
}