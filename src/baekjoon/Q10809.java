package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        String str = scanner.next();
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 97; //

            if (arr[index] == -1) {
                arr[index] = i;
            }
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
