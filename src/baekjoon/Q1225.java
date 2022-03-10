package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine(); // 한줄로 다 읽기

        String[] str = a.split(" "); // 공백 기준으로 나누기
        int[] arrA = new int[str[0].length()]; // 0번째 123 길이
        int[] arrB = new int[str[1].length()]; // 1번째 45 길이

        long sum = 0; // 10000자리로 인해 long
        for (int i = 0; i < str[0].length(); i++) { // 문자 하나씩 쪼개서 배열에 넣기
            arrA[i] = str[0].charAt(i) - 48; // 아스키코드 0 = 48 기준으로 원하는 값 넣기
        }
        for (int i = 0; i < str[1].length(); i++) {
            arrB[i] = str[1].charAt(i) - 48;
        }
        for (int k : arrA) { // i번째 하나씩 대입
            for (int i : arrB) { // j 번째 하나씩 대입
                sum += ((long) k * i); // 문자이므로 long 으로 캐스팅 하고 더한 다음 출력
            }
        }
        System.out.println(sum);
    }
}
