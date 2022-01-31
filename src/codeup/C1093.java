package codeup;

import java.util.Scanner;

public class C1093 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            int count = 0;

            if (arr[i] == i) {
                count++;
                System.out.println(i);
            }
        }
    }
}
