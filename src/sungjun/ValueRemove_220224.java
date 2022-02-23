package sungjun;

import java.util.Arrays;
import java.util.Scanner;

public class ValueRemove_220224 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{10, 20, 30, 40, 50};
        int value = scanner.nextInt();

        System.out.println(Arrays.toString(solution(arr, value)));

    }

    public static int[] solution(int[] arr, int value) {
        int[] returnArr = new int[arr.length - 1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                returnArr[count] = arr[i];
                count++;
            }
        }

        return returnArr;
    }
}
