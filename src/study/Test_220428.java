package study;

import java.util.Scanner;

public class Test_220428 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] > arr[j]) {
                        sb.append(arr[i]).append(" ");
                    }
                } else if (arr[i] < arr[j]) {
                    sb.append(arr[j]).append(" ");
                } else if (arr[i] == arr[j]) {
                    sb.append(arr[i]).append(" ").append(arr[j]);
                }
            }
        }
        System.out.println(sb);
    }
}