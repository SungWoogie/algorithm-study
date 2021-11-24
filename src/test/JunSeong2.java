package test;

import java.util.Scanner;

//2021.11.23 배열 거꾸로 출력
public class JunSeong2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i : reverse(arr)) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : newReverse(arr)) {
            System.out.print(i + " ");
        }
    }

    public static int[] reverse(int[] array) { // 파라미터로 배열받아서 리턴
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    public static int[] newReverse(int[] array) { // 배열 받아서 새로운 배열로 값 뒤집어서 리턴
        int[] array1 = new int[10];

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            array1[i] = temp;
        }
        return array1;
    }
}
