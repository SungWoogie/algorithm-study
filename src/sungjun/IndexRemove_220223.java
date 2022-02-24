package sungjun;

import java.util.Arrays;
import java.util.Scanner;

public class IndexRemove_220223 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{50, 10, 20, 30, 40};
        while (true) {
            int index = scanner.nextInt();
            arr = solution(arr, index);
            System.out.println(Arrays.toString(arr));
        }
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
