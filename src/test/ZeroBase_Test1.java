package test;

import java.util.Arrays;

public class ZeroBase_Test1 {
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int[][] newArr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    newArr[i][j] = 10;
                } else if (i == 0 && j == 2) {
                    newArr[i][j] = 10;
                } else if (i == 2 && j == 0) {
                    newArr[i][j] = 10;
                } else {
                    newArr[i][j] = 1;
                }
            }
        }
        for (int[] a : newArr) {
            System.out.println(Arrays.toString(a));
        }



        /*
        1
        3
        5
        7
         */
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                continue;
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int temperature = 0;
        while (temperature < 100) {
            temperature++;
            if (temperature % 10 == 0) {
                System.out.println(temperature + "도 입니다.");
            }
        }
    }
}
