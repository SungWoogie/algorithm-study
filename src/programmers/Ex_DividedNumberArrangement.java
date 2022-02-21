package programmers;

import java.util.Arrays;

public class Ex_DividedNumberArrangement {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 36, 1, 3};
        int divisor = 1;

        System.out.println(Arrays.toString(solution(arr, divisor)));
    }

    public static int[] solution(int[] arr, int divisor) {

        int count = 0;

        for (int k : arr) {
            if (k % divisor == 0) {
                count++;
            }
        }
        if (count == 0) {
            return new int[]{-1};
        } else {
            int[] numArr = new int[count];
            count = 0;
            for (int j : arr) {
                if (j % divisor == 0) {
                    numArr[count] = j;
                    count++;
                }
            }
            Arrays.sort(numArr);
            return numArr;
        }
    }
}
