package baekjoon;

import java.util.Scanner;

public class Q1159_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[26]; // 알파벳 비교하기 위해서 26칸 배열
        int n = scanner.nextInt(); // 테스터 케이스 입력

        for (int i = 0; i < n; i++) { // n 만큼 반복하는 for 문
            String str = scanner.next(); // 문자열 입력
            int ch = str.charAt(0) - 97; // charAt(0) 으로 맨 앞에 글자만 가져와서 - 97
            arr[ch]++; // 뺀 값을 해당하는 인덱스에 1씩 증가
        }

        for (int i = 0; i < arr.length; i++) { // arr 길이만큼 반복하는 for 문
            if (arr[i] >= 5) { // 인덱스에 5랑 같거나 5보다 큰 값을 찾는 조건
                sb.append((char) (i + 97)); // 문자를 이어붙이기 위하여 해당 값을 char 로 캐스팅 하고,
            }                               // 그 값 넣기 위해 i + 97
        }
        if (sb.length() == 0) { // 해당하는게 없으면 PREDAJA 출력
            System.out.println("PREDAJA");
        } else { // 그렇지 않으면 sb 출력
            System.out.println(sb);
        }
    }
}
