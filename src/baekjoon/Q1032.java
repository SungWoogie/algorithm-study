package baekjoon;

import java.util.Scanner;

public class Q1032 {    // 명령 프롬프트
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();
        String[] strArr = new String[testCase];

        for (int i = 0; i < testCase; i++) { // 각 인덱스에 문자열 입력
            strArr[i] = scanner.next();
        }

        StringBuilder sb = new StringBuilder(); // 문자열 더해서 출력하기 위한 StringBuilder
        boolean isSame = true;  // 값 다를 경우를 판별하기 위한 boolean

        for (int i = 0; i < strArr[0].length(); i++) { // 길이는 같으므로 첫번째 문자열 값 고정으로 반복
            for (int j = 1; j < testCase; j++) {
                isSame = true;
                if (strArr[0].charAt(i) != strArr[j].charAt(i)) { // 문자를 하나씩 가져와서 같은지 다른지 각각 비교
                    isSame = false; // 하나라도 다를 경우 false 바꾸고 break
                    break;
                }
            }
            if (isSame) { // true 면 문자 그대로 빌더에 저장
                sb.append(strArr[0].charAt(i));
            } else {
                sb.append("?");
            }
        }
        System.out.println(sb); // 출력
    }
}
