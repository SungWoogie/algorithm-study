package baekjoon;

import java.util.Scanner;

public class Q21866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[]{100, 100, 200, 200, 300, 300, 400, 400, 500};
        int[] numArr = new int[9];

        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            numArr[i] = scanner.nextInt();

            if (arr[i] < numArr[i]) {
                count++;
            } else if (arr[i] >= numArr[i]) {
                sum += numArr[i];
            }
        }
        if (count > 0) {
            System.out.println("hacker");
        } else if (sum >= arr[0]) {
            System.out.println("draw");
        } else {
            System.out.println("none");
        }
    }
}
