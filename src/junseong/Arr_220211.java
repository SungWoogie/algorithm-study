package junseong;

import java.util.Scanner;

public class Arr_220211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n]; // 1 2 3 4 5
        int[] newArr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[arr.length - 1 - i];

        }
        for (int a : newArr) {
            System.out.print(a + " ");
        }
    }
}
