package baekjoon;

import java.util.Scanner;

public class Q14720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 우유 가게
        int[] arr = new int[n];

        int milk = 0; // 우유가게
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int j : arr) {
            if (j == 0 && milk == 0) {
                milk = 1;
                count++;
            }
            if (j == 1 && milk == 1) {
                milk = 2;
                count++;
            }
            if (j == 2 && milk == 2) {
                milk = 0;
                count++;
            }
        }
        System.out.println(count);
    }
}
