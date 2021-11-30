package test;

import java.util.Arrays;

public class CodingTest_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        int[] tempArr = new int[3];
        int[] resultArr = new int[3];

        int count = 0; // 2
        int max = 0; // 3

        for (int num : arr) {
            for (int i : arr) {
                if (num == i) {
                    count++;
                    if (num == 1) {
                        tempArr[0] = count;
                    } else if (num == 2) {
                        tempArr[1] = count;
                    } else {
                        tempArr[2] = count;
                    }
                }
            }
            count = 0;
        }
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[0] > tempArr[1]) {
                max = tempArr[0];
            } else if (tempArr[1] > tempArr[2]) {
                max = tempArr[1];
            } else {
                max = tempArr[2];
            }
            resultArr[i] = max - tempArr[i];
        }
        return resultArr;
    }
}
