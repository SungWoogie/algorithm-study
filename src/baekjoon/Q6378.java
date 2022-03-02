package baekjoon;

import java.util.Scanner;

public class Q6378 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.next();

            if (str.equals("0")) { // 문자열 길이가 0 이면 break
                break;
            }
            while (true) {
                int sum = 0; // 더한 값 저장 할 변수
                if (str.length() < 2) { // 문자열 길이가 두자릿 수 보다 작으면
                    break;
                } else {
                    for (int i = 0; i < str.length(); i++) {
                        sum += str.charAt(i) - 48;
                    }
                }
                str = String.valueOf(sum);
            }
            System.out.println(str);
        }
    }
}
