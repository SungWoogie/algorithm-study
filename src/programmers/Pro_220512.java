package programmers;

import java.util.Arrays;

public class Pro_220512 {   // 문자열 내림차순으로 배치하기
    public static String solution(String str) {
        String answer;

        String[] strArr = str.split("");    // String 배열에 문자열을 스플릿하여 넣어준다.
        Arrays.sort(strArr);    // sort 메소드를 사용하여 오름차순으로 우선 정렬

        StringBuilder sb = new StringBuilder();
        for (String s : strArr) {   // 문자를 더하기 위해 값을 하나씩 꺼내어 빌더에 저장
            sb.append(s);
        }
        answer = String.valueOf(sb.reverse());  // 오름차순으로 정렬하였으니 빌더 내부에 리버스 메소드 활용하여
        return answer;                          // 값 뒤집어 반환할 값에 저장
    }

    public static void main(String[] args) {
        String str = "Zbcdefg";
        System.out.println(solution(str));
    }
}
