package zerobase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingTest_230629_3 {
    public static String[][] solution(String[] words, String[] queries) {
        String[][] result = new String[queries.length][];

        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];

            List<String> matchingWords = new ArrayList<>();
            for (String word : words) {
                if (isMatch(word, query)) {
                    matchingWords.add(word);
                }
            }

            result[i] = matchingWords.toArray(new String[0]);
        }

        return result;
    }

    public static boolean isMatch(String word, String query) {
        if (word.length() != query.length()) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            char wordChar = word.charAt(i);
            char queryChar = query.charAt(i);

            if (queryChar != '?' && queryChar != wordChar) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(
                new String[]{"hello", "hear", "hell", "good", "goose", "children", "card", "teachable"},
                new String[]{"he??", "g???", "childre?", "goo????", "?"}
        )));
        /*
        {{"hear", "hell"},
         {"good"},
         {"children"},
         {},
         {}}
         */
    }
}
