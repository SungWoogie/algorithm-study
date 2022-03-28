package baekjoon;

import java.util.Scanner;

public class Q2592_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[1000];

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            sum += num;
            arr[num]++;
        }
        int max = 0;
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                value = i;
            }
        }

        int average = sum / 10;
        System.out.println(average);
        System.out.println(value);
    }
}
