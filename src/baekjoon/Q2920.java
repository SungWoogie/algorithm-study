package baekjoon;

import java.util.Scanner;

public class Q2920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[8];
        int ascending = 0;
        int descending = 0;

        for (int i = 0; i < arr.length; i++) { //1~ 8 이니까
            arr[i] = scanner.nextInt();
            if (arr[i] == i + 1) {
                ascending++;
            } else if (arr[i] == 8 - i) {
                descending++;
            }
        }

        if (ascending == 8) {
            System.out.println("ascending");
        } else if (descending == 8) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }


    }
}