package baekjoon;

import java.util.Scanner;

public class Q10808 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] arr = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] arr1 = new int[26];
        String str = scanner.next();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 0; j < arr.length; j++) {
                if (ch == arr[j]) {
                    arr1[j]++;
                }
            }
        }
        for (int a : arr1) {
            System.out.print(a + " ");
        }
    }
}
