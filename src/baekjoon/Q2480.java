package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

// 2021.11.16
public class Q2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        if (arr[0] == arr[1] && arr[1] == arr[2]) {
            System.out.println(10000 + (arr[0] * 1000));
        } else if (arr[0] == arr[1] || arr[1] == arr[2]) {
            System.out.println(1000 + arr[1] * 100);
        } else {
            System.out.println(arr[2] * 100);
        }
    }
}

