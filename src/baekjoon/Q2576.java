package baekjoon;

import java.util.Scanner;

public class Q2576 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[7];
        int sum = 0;
        int count = 0;
        int min = 100;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 == 1) {
                sum += arr[i];
                if (arr[i] < min) {
                    min = arr[i];
                }
            } else {
                count++;
            }
        }

        if (count == arr.length) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
