package baekjoon;

import java.util.Scanner;

public class Q10797 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        int day = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] == day) {
                count++;
            }
        }
        System.out.println(count);
    }
}