package zerobase;

import java.util.Deque;
import java.util.LinkedList;

public class PreCodingTest_230517_1 {
    public static String solution(int n, String s, int t) {
        String answer = "";
        Deque<Character> deque = new LinkedList<>(); // 문자를 저장할 Deque 생성

        // 전광판 초기화
        for (int i = 0; i < n; i++) {
            deque.offerLast('.');
        }

        // 모든 문자열을 Deque 에 추가
        for (char c : s.toCharArray()) {
            deque.offerLast(c);
        }

        for (int i = 0; i < t; i++) {
            char peek = deque.pollFirst();
            deque.offerLast(peek);
        }

        // 전광판의 현재 상태를 문자열로 반환
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(deque.pollFirst());
        }
        answer = sb.toString();
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(5, "Snowball", 18));
    }

}
