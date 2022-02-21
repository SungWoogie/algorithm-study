package baekjoon;

import java.util.Scanner;

public class Q2562_220222 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[9];

        int max = 0;
        int count = 0;

        for (int i = 1; i <= arr.length; i++) {
            arr[i - 1] = scanner.nextInt();
            if (max < arr[i - 1]) {
                max = arr[i - 1];
                count = i;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
