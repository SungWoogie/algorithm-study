package programmers;

import java.util.Arrays;

public class Pro_220419 {
    public static void main(String[] args) {
        int[] arr = {10};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];

        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer[count] = arr[i];
                count++;
            }
        }
        return answer;
    }
}
