package zerobase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PreCodingTest_230517_2 {
    public static String[] solution(String s) {
        List<String> answer = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ' || c == ',' || c == '.' || c == '!' || c == '?') { //
                if (currentWord.length() > 0) { // 5
                    answer.add(String.valueOf(currentWord.reverse()));
                    currentWord.setLength(0);
                }
            } else { // Hello
                currentWord.append(c);
            }
        }

        // 조건문과 해당 코드는 마지막 단어가 구분자 뒤에 아무런 문자가 없는 경우를 처리하기 위해 사용.
        if (currentWord.length() > 0) {
            answer.add(String.valueOf(currentWord.reverse()));
        }

        return answer.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("Hello, World!?")));
    }

}
