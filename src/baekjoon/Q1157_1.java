package baekjoon;

import java.util.Scanner;

public class Q1157_1 {  // 단어 공부
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] alphabet = new int[26];
        String str = scanner.nextLine().toUpperCase();

        for (int i = 0; i < str.length(); i++) { // 입력한 알파벳 개수 확인
            int tempNum = str.charAt(i) - 65; // 값을 하나씩 가져와서 대문자 - A
            alphabet[tempNum]++;    // 해당 위치에 ++
        }

        int max = -1; // 배열안에 초기 값이 0이므로 -1로 지정
        char ch = '?';
        for (int i = 0; i < alphabet.length; i++) { // 최대값 찾기
            if (alphabet[i] > max) {
                max = alphabet[i];
                ch = (char) (i + 65);
            } else if (alphabet[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
