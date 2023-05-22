package programmers;

import java.util.*;
// 한번만 등장한 문자
public class P230522_1 {
    public static String solution(String s) {
        String answer;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        List<Character> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                list.add(m.getKey());
            }
        }
        Collections.sort(list);
        StringBuilder answerBuilder = new StringBuilder();
        for (char c : list) {
            answerBuilder.append(c);
        }
        answer = answerBuilder.toString();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("abcabcadc"));
        System.out.println(solution("abdc"));
        System.out.println(solution("hello"));
    }
}
