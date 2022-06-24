package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q1427 { // 소트인사이드
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - 48;
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int j : arr) {
            sb.append(j);
        }
        System.out.println(sb.reverse());
    }
}
