package baekjoon;

import java.util.Scanner;

public class Q1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int[] arr = new int[t];

        double max = 0; // 최고점수
        double value = 0;
        double sum = 0; // 총합
        for (int i = 0; i < t; i++) {
            arr[i] = scanner.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int j : arr) {
            value = (j / max) * 100;
            sum += value;
        }
        System.out.println(sum / t);
    }
}
