package programmers;

import java.util.Arrays;

public class Challenger_9 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 2, 1};
        int[] result = solution(arr);

        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int min = arr[0];
        for (int j : arr) {
            min = Math.min(min, j);
        }
        int[] answer = new int[arr.length - 1];
        int count = 0;
        for (int j : arr) {
            if (j == min) {
                continue;
            }
            answer[count] = j;
            count++;
        }
        return answer;
    }
}
