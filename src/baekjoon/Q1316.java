package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[26];
        int t = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < t; i++) {
            Arrays.fill(arr, -1);
            String str = scanner.next();
            int group = 1;
            char previousWord = '5';

            for (int j = 0; j < str.length(); j++) { // happy
                if (str.charAt(j) == previousWord) { // 연속된 문자면 넘김 h == '1'
                    continue;
                }
                int index = str.charAt(j) - 'a'; // h = 7,
                if (arr[index] != -1) { // 전에 들어왔던 문자인지 확인, 들어왔던 문자면 그룹단어가 아님 (들어왔던거면 -1과 같지 않음)
                    group = 0;
                    break;
                }
                arr[index] = 5;
                previousWord = str.charAt(j); // 이전 문자를 현재 문자로 바꿔줌으로 반복하여 확인
            }
            if (group == 1) { // 그룹단어인지 체크하고 카운트
                count++;
            }
        }

        System.out.println(count);
    }
}
