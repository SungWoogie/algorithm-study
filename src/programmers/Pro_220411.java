package programmers;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Pro_220411 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1}, {2}};
        int[][] arr1 = new int[][]{{3}, {4}};

        System.out.println(deepToString(solution(arr, arr1)));

    }

    public static int[][] solution(int[][] arr, int[][] arr1) {

        int[][] answer = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                answer[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        return answer;
    }
}
