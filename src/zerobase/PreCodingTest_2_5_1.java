package zerobase;

import java.util.List;

// 해당 문자열 인덱스 찾기
public class PreCodingTest_2_5_1 {
    public static int solution(String sentence, String word) {
        if (sentence.isEmpty() || word == null) {
            return -1;
        }
        List<String> words = List.of(sentence.split(" "));
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals(word)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution("Hello every world","every")); // 1
        System.out.println(solution("Hello every world","ever")); // -1
    }
}
