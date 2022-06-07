package study;

import java.util.Arrays;

public class Study_220602 {
    public static void main(String[] args) {
        int[] arr = {20, 30, 50, 10, 70};
        int[] copyArr = Arrays.copyOfRange(arr, 2, 5);

        for (int a : copyArr) {
            System.out.print(a + " ");

        }
    }
}
