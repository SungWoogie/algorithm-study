package baekjoon;

import java.util.*;

public class Q9093 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // 이부분??
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) { // 테스터 케이스 2만큼 반복
            String str = scanner.nextLine(); // 문자열 두개입력
            String[] splits = str.split(" "); // 공백기준으로 쪼개서 splits 배열에 넣음

            for (String s : splits) { // 포이치문에 나눠서 담은걸 s에 하나씩 대입
                StringBuilder sb = new StringBuilder(s); // 하나씩 대입한걸 빌더에 저장 ??
                answer.append(sb.reverse() + " "); // 하니씩 가져와서 문자 뒤집고 간격까지 첫번째 빌더에 저장 // 여기가 포인트네
            }
            answer.append("\n"); // 첫번쨰 포문 끝나기전에 줄바꿈
        }
        System.out.println(answer);
    }
}
