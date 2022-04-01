package baekjoon;

import java.util.Scanner;

public class Q11944 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) { // n만큼 빌더에 대입
            sb.append(n);
        }
        if (sb.length() > m) { // sb.length 가 m 보다 크면
            System.out.println(sb.substring(0, m)); // subString 메소드를 활용해서 0,m 까지 출력
        } else {
            System.out.println(sb);
        }
    }
}