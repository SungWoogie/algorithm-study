package sungjun;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_220223 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{50, 10, 20, 30, 40};
        int index = scanner.nextInt();

        System.out.println(Arrays.toString(solution(arr, index)));
    }

    public static int[] solution(int[] arr, int index) {
        int[] returnArr = new int[arr.length - 1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                returnArr[count] = arr[i];
                count++;
            }
        }
        return returnArr;
    }
}
