package sungjun;

import java.util.Scanner;

public class Q2908_1_211207 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        int[] arr1 = new int[3];
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = first % 10;
            first /= 10;
        }
        int number = arr[0] * 100 + arr[1] * 10 + arr[2];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = second % 10;
            second /= 10;
        }
        int number1 = arr1[0] * 100 + arr1[1] * 10 + arr1[2];
        if (number > number1) {
            System.out.println(number);
        } else {
            System.out.println(number1);
        }
    }
}
