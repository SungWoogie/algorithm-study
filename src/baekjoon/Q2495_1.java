package baekjoon;

import java.util.Scanner;

public class Q2495_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String str = scanner.next();

            int[] arr = new int[8];
            arr[0] = str.charAt(0) - '0'; // 임시 값 하나 저장
            int count = 0;
            int max = 0;

            for (int j = 1; j < arr.length; j++) {
                arr[j] = str.charAt(j) - '0';
                if (arr[0] != arr[j]) {
                    arr[0] = arr[j];
                    max = Math.max(max, count);
                    count = 1;
                } else {
                    count++;
                }
                max = Math.max(max, count);
            }
            System.out.println(max);
        }
    }
}
