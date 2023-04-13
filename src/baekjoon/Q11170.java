package baekjoon;

import java.util.Scanner;

public class Q11170 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        n 과 m 의 숫자를 입력 받아서
        입력한 값 n 부터 m 까지 숫자중에 0이 몇개 들어가는지 확인
         */

        int testCase = scanner.nextInt(); // 몇개 숫자 입력 할지 3
        for (int i = 0; i < testCase; i++) {
            int n = scanner.nextInt(); // 33
            int m = scanner.nextInt(); // 1005

            int sum = 0;
            for (int j = n; j <= m; j++) {
                String text = String.valueOf(j); // 길이 구하기 위해서 문자로 변경 -> 33
                for (int k = 0; k < text.length(); k++) {
                    if (text.charAt(k) == '0') {
                        sum++;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
