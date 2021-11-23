package test;

import java.util.Scanner;

//2021.11.23 배열 거꾸로 출력
public class JunSeong2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr1 = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        reverse(arr);
        System.out.println();
        newReverse(arr, arr1);
    }

    public static int[] reverse(int[] array) { // 파라미터로 배열받아서 리턴
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]+" ");
        }
        return array;
    }

    public static int[] newReverse(int[] array, int[] array1) { // 배열 받아서 새로운 배열로 값 뒤집어서 리턴
        for (int i = array.length - 1; i >= 0; i--) {
            array1[i] = array[i];
            System.out.print(array1[i]+" ");
        }
        return array1;
    }
}
