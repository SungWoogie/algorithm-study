package codeup;

import java.util.Scanner;

public class C1277 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(arr[0] + " " + arr[n / 2] + " " + arr[n - 1]);
    }
}
