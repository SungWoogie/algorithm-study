package baekjoon;

import java.util.Scanner;

public class Q1371_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[26];

        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    arr[str.charAt(i) - 'a']++;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                System.out.print((char) (i + 'a'));
            }
        }
    }
}