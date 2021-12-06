package sungjun;

import java.util.Arrays;

public class SungJun1_211201 {
    public static void main(String[] args) {
        int num = 1000;
        int[] arr = new int[]{50, 60, 70, 10, 20, 30, 50, 60, 70, 80, 20};
        int[] newArray = add(arr, num);

        System.out.println(Arrays.toString(newArray));
    }

    public static int[] add(int[] arr, int num) {
        int[] returnArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            returnArr[i] = arr[i];
        }
        returnArr[returnArr.length - 1] = num;
        return returnArr;
    }
}
