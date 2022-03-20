package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q3047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        String str = scanner.next();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                System.out.print(arr[0] + " ");
            } else if (str.charAt(i) == 'B') {
                System.out.print(arr[1] + " ");
            } else {
                System.out.print(arr[2] + " ");
            }
        }
    }
}
