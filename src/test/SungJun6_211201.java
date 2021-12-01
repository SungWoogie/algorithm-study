package test;

import java.util.Scanner;

public class SungJun6_211201 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{11, 21, 31, 41, 51};
        int num = scanner.nextInt();

        int get = indexGet(arr, num);
        System.out.println(get);
    }

    public static int indexGet(int[] arr, int num) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count = i;
            }
        }
        return count;
    }
}
