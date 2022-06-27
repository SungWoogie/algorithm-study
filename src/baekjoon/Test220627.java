package baekjoon;

import java.util.Scanner;

public class Test220627 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + ",");
        }
    }
}
