package programmers;
// Lv 0 : 배열 두배 만들기

import java.util.Arrays;

public class P230428_1 {
    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr1 = new int[]{1, 2, 100, -99, 1, 2, 3};
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println(Arrays.toString(solution(arr1)));
    }
}