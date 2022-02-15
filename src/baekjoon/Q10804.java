package baekjoon;

import java.util.Scanner;

public class Q10804 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 0; i < 10; i++) { // 10개 입력하는 포문
            int start = scanner.nextInt() - 1;
            int end = scanner.nextInt() - 1;

            int num = (Math.abs(start - end + 1) / 2);
            int count = 0;
            for (int j = 0; j < num; j++) {
                int tmp = arr[start + count];
                arr[start + count] = arr[end - count];
                arr[end - count] = tmp;
                count++;
            }
        }
        for (int b : arr) {
            System.out.print(b + " ");
        }
    }
}
