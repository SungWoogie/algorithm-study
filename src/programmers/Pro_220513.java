package programmers;

import java.util.Arrays;

public class Pro_220513 {   // 문자열 내 마음대로 정렬하기
    public static String[] solution(String[] strArr, int n) {
        String[] answer;
        String[] strings = new String[strArr.length];   //  문자열 안에 n 값 저장하기 위한 배열 생성 한다.

        for (int i = 0; i < strArr.length; i++) {
            strings[i] = strArr[i].charAt(n) + strArr[i];   // 각각의 문자열의 n 번째 값을 가지고 + 해당 문자열을 더 해준다.
        }                                                   // 사전순의 값 대비

        Arrays.sort(strings);   // 오름차순으로 정렬

        answer = strings;

        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].substring(1);    // 해당 값을 가져와서 1번째 인덱스 부터 출력한다.
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] strArr = {"abce", "abcd", "cdx"};
        int n = 2;

        System.out.println(Arrays.toString(solution(strArr, n)));
    }

}
