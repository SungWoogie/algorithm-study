package zerobase;

import java.util.Arrays;
// 주어진 숫자 조합해서 가장 큰 수
public class CodingTest_230706_2 {
    public static String solution(int[] numbers) {
        // 정수 배열을 문자열로 변환
        String[] numStr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numStr[i] = String.valueOf(numbers[i]);
        }

        // 문자열을 정렬하여 가장 큰 수로 조합
        Arrays.sort(numStr, (a, b) -> {
            String ab = a + b;
            String ba = b + a;
            return ba.compareTo(ab);
        });

        // 조합된 문자열 반환
        StringBuilder sb = new StringBuilder();
        for (String str : numStr) {
            sb.append(str);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 30, 34, 5, 9})); // "9534330'
    }
}