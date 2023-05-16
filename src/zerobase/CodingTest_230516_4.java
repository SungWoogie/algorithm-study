package zerobase;


import java.util.HashMap;
import java.util.Map;

public class CodingTest_230516_4 {
    public static int solution(String s) {
        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 숫자인 경우에만 빈도수 증가
            if (Character.isDigit(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }
        int maxFrequency = 0;
        char mostFrequentNumber = '\0';

        // 맵에서 가장 빈도수가 높은 숫자 찾기
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency || (frequency == maxFrequency && entry.getKey() < mostFrequentNumber)) {
                maxFrequency = frequency;
                mostFrequentNumber = entry.getKey();
            }
        }
        answer = Character.getNumericValue(mostFrequentNumber);
        // 가장 빈도수가 높은 숫자를 정수로 반환
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("174771177")); // 7
        System.out.println(solution("552342502")); // 2


    }

}
