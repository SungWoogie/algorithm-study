package zerobase;

import java.util.*;

// 낱말 패턴 비교하기
public class PreCodingTest_2_1_3 {
    public static boolean solution(String p, String s) {
        Map<String, Integer> pPatterns = saveStringPatternCount(p.split(""));
        Map<String, Integer> sPatterns = saveStringPatternCount(s.split(" "));

        return pPatterns.size() == sPatterns.size();
    }

    public static Map<String, Integer> saveStringPatternCount(String[] tempPattern) {
        Map<String, Integer> patterns = new HashMap<>();
        for (String pattern : tempPattern) {
            patterns.put(pattern, patterns.getOrDefault(pattern, 0) + 1);
        }
        return patterns;
    }

    public static void main(String[] args) {
        System.out.println(solution("가나다라", "바나나 드래곤 스리랑카 오염")); // t
        System.out.println(solution("갸가갸가", "금도끼 은도끼 철도끼 은도끼")); // f
    }
}
