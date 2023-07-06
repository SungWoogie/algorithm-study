package zerobase;

import java.util.Arrays;

// '애너그램' 주어진 문자열 2개가 같은지 아닌지 맞출 때
public class CodingTest_230706_1 {
    public static boolean solution(String s, String t) {
        // 길이 먼저 확인
        if (s.length() != t.length()) {
            return false;
        }

        // 문자열을 정렬하여 비교
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // 정렬했을 때 다르면 false
        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        System.out.println(solution("imfinethankyou", "atfhinemnoyuki")); // true
    }
}