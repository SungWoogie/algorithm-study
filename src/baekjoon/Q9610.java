package baekjoon;

import java.util.Scanner;

public class Q9610 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int[] arr = new int[t];

        for (int i = 1; i <= arr.length; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x == 0 || y == 0) { // AXIS
                arr[4]++;
            } else if (x > 0 && y > 0) { // Q1
                arr[0]++;
            } else if (x < 0 && y > 0) { // Q2
                arr[1]++;
            } else if (x < 0) { // Q3
                arr[2]++;
            } else { // Q4
                arr[3]++;
            }
        }
        System.out.println("Q1: " + arr[0]);
        System.out.println("Q2: " + arr[1]);
        System.out.println("Q3: " + arr[2]);
        System.out.println("Q4: " + arr[3]);
        System.out.println("AXIS: " + arr[4]);
    }
}
