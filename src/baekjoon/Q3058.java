package baekjoon;

import java.util.Scanner;

public class Q3058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int sum;
        int min;
        for (int i = 0; i < t; i++) {
            int[] arr = new int[7];
            sum = 0;
            min = 100;
            for (int j = 0; j < arr.length; j++) {
                arr[j] = scanner.nextInt();
                if (arr[j] % 2 == 0) {
                    sum += arr[j];
                    if (arr[j] < min) {
                        min = arr[j];
                    }
                }
            }
            System.out.println(sum + " " + min);
        }
    }
}
