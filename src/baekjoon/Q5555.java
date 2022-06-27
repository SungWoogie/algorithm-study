package baekjoon;

import java.util.Scanner;

public class Q5555 { // 반지
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.next(); // 비교할 문자 입력

        int num = scanner.nextInt(); // 테스터 케이스 입력
        int count = 0; // 출력하기 위한 카운터 변수 생성
        for (int i = 0; i < num; i++) {
            String str = scanner.next(); // 문자열 입력
            str += str; // 마지막 문자열과 같으면 처음 문자도 비교하기 위해 문자열 더하기
            if (str.contains(text)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
