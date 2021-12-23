package baekjoon;

import java.util.Scanner;

public class Q1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[26]; // 알파벳 개수

        String str = scanner.next().toUpperCase(); // 대문자 출력으로 대문자 입력

        int max = 1;
        char ch = '?';

        for (int i = 0; i < str.length(); i++) {
            int index = arr[str.charAt(i) - 65];
            index++;
            if (max < index) {
                max = index;
                ch = str.charAt(i);
            } else if (max == index) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
