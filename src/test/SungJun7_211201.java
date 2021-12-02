package test;

import java.util.Scanner;

public class SungJun7_211201 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            for (int i : 지움(arr, scanner.nextInt())) {
                System.out.print(i + " ");
            }
        }
    }

    public static int[] 지움(int[] arr, int index) {
        int[] arr1 = new int[arr.length - 1];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                arr1[count] = arr[i];
                count++;
            }
        }
        return arr1;
    }
}
