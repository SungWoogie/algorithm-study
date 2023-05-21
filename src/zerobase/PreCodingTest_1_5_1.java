package zerobase;

import java.util.*;

public class PreCodingTest_1_5_1 {
    public static String solution(String s) {
        String answer = "";

        Map<Character, Integer> alphabet = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            alphabet.put((char) ((char) 97 + i), 0);
        }

        for (int i = 0; i < s.length(); i++) {
            if (alphabet.containsKey(s.charAt(i))) {
                alphabet.put(s.charAt(i), alphabet.getOrDefault(s.charAt(i), 0) + 1);
            }
        }

        int max = 0;
        for (Map.Entry<Character, Integer> entry : alphabet.entrySet()) {
            max = Math.max(entry.getValue(), max); // 최대값 찾기
        }
        List<Character> characters = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : alphabet.entrySet()) {
            if (max == entry.getValue()) {
                characters.add(entry.getKey());
            }
        }
        Collections.sort(characters);
        answer = characters.get(0).toString();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("google")); // "g"
    }

}
