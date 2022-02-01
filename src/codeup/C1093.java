package codeup;

import java.util.Scanner;

public class C1093 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[23];
        int count = 0;

        for (int i = 1; i <= n; i++) {
            count = scanner.nextInt();
            arr[count - 1]++;
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}