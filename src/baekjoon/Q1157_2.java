package baekjoon;

import java.util.Scanner;

public class Q1157_2 { // 단어 공부
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] alphabetArr = new int[26];

        String str = scanner.next().toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            int temp = str.charAt(i) - 65;
            alphabetArr[temp]++;
        }
        char symbol = '?';
        int num = -1;

        for (int i = 0; i < alphabetArr.length; i++) {
            if (alphabetArr[i] > num) {
                num = alphabetArr[i];
                symbol = (char) (i + 65);
            } else if (alphabetArr[i] == num) {
                symbol = '?';
            }
        }
        System.out.println(symbol);
    }
}
