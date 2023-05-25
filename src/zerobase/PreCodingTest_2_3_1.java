package zerobase;

import java.util.*;
// compare 문자열 연속 정렬 문제
public class PreCodingTest_2_3_1 {
    public static String solution(String s) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> characters = new ArrayList<>(map.keySet());
        characters.sort((a, b) -> {
            int compare = map.get(b) - map.get(a);
            if (compare != 0) {
                return compare;
            } else {
                return a.compareTo(b);
            }
        });

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : characters) {
            stringBuilder.append(c).append(" ");
        }
        for (int i = 0; i <= 9; i++) {
            char c = (char)(i + '0');
            if (!characters.contains(c)) {
                stringBuilder.append(c).append(" ");
            }
        }
        answer = stringBuilder.toString().trim();
        return answer;
}

    public static void main(String[] args) {
        System.out.println(solution("221123")); // 2 1 3 0 4 5 6 7 8 9
    }
}
