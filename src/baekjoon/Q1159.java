package baekjoon;

import java.util.Scanner;

public class Q1159 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[26];

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) { // 입력한 이름 앞글자를 가져오기 위한 for 문
            String name = scanner.next();
            int ch = name.charAt(0) - 97; // 소문자 a = 97
            arr[ch]++;
        }
        StringBuilder sb = new StringBuilder(); // 출력한 성을 붙여서 출력하기 위하여 빌더 생성

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) {
                sb.append((char) (i + 97));
            }
        }
        if (sb.length() == 0) {
            System.out.print("PREDAJA");
        } else {
            System.out.print(sb);
        }
    }
}
