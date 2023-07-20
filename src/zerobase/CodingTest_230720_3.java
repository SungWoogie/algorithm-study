package zerobase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CodingTest_230720_3 {
    public static String[] solution(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        Collections.sort(result);

        return result.toArray(new String[0]);
    }

    private static void backtrack(String s, int index, List<String> current, List<String> result) {
        if (index == s.length() && current.size() == 4) {
            result.add(String.join(".", current));
            return;
        }

        for (int i = 1; i <= 3; i++) {
            if (index + i > s.length()) {
                break;
            }

            String segment = s.substring(index, index + i);
            if (isValid(segment)) {
                current.add(segment);
                backtrack(s, index + i, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    private static boolean isValid(String segment) {
        int num = Integer.parseInt(segment);
        return segment.length() == Integer.toString(num).length() && num >= 0 && num <= 255;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("11011")));
        // {"1.1.0.11","1.10.1.1","11.0.1.1"}
    }

}
