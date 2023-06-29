package zerobase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CodingTest_230629_2 {
    public static int[] solution(String[] words, String[] queries) {
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];

            for (String word : words) {
                if (isMatch(word, query)) {
                    result[i]++;
                }
            }
        }

        return result;
    }

    public static boolean isMatch(String word, String query) {
        // 앞 부분 검색
        if (query.endsWith("*")) {
            String prefix = query.substring(0, query.length() - 1);
            return word.startsWith(prefix);
        }
        // 뒷 부분 검색
        else if (query.startsWith("*")) {
            String suffix = query.substring(1);
            return word.endsWith(suffix);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(
                new String[]{"hello", "hell", "good", "goose", "children", "card", "teachable"},
                new String[]{"hell*", "goo*", "*able", "qua*"}
        ))); // 2,2,1,0
    }
}
