package programmers;

import java.util.Arrays;

public class Challenger_9_Review {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 4, 3};
        System.out.println(Arrays.toString(solution(arr)));

    }

    public static int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        } else {
            int min = arr[0];
            for (int j : arr) {
                min = Math.min(min, j); // 4
            }
            int[] answer = new int[arr.length - 1];
            int count = 0;
            for (int k : arr) {
                if (min != k) {
                    answer[count] = k;
                    count++;
                }
            }
            return answer;
        }
    }
}
