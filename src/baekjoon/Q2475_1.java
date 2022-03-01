package baekjoon;

import java.util.Scanner;

//22.03.01
public class Q2475_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i] * arr[i];
        }
        System.out.println(sum % 10);
    }
}
