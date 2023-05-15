package programmers;

import java.util.HashMap;
import java.util.Map;

// 숫자 문자열과 영단어
public class P230515_1 {
    public static int solution(String s) {
        int answer;
        Map<String, Integer> words = new HashMap<>() {
            {
                put("zero", 0);
                put("one", 1);
                put("two", 2);
                put("three", 3);
                put("four", 4);
                put("five", 5);
                put("six", 6);
                put("seven", 7);
                put("eight", 8);
                put("nine", 9);

            }
        };

        StringBuilder text = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) { // 1. toCharArray() 사용해서 char 배열 생성해서 문자 하나씩 꺼내기
            if (Character.isDigit(c)) { // 2. 해당하는 문자가 숫자면 true 반환
                result.append(c); // 3. 숫자일 경우 바로 result 에 바로 저장
            } else {
                text.append(c); // 숫자가 아닌 경우에 text 스트링빌더에 저장
                if (words.containsKey(text.toString())) { // 저장된 스트링빌더를 문자열로 반환하여 map 에 key 값으로 존재하는지 확인
                    result.append(words.get(text.toString())); // key 값에 존재 할 경우 get() 하여 해당 key 의 value 값 가져와서
                    text.setLength(0); // result 에 저장하고, 한단어가 끝나면 text 빌더 길이 0 으로 초기화
                }
            }
        }
        answer = Integer.parseInt(result.toString()); // 빌더 숫자로 변환하여 반환
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("one4seveneight")); // 1478
        System.out.println(solution("23four5six7")); // 234567
        System.out.println(solution("2three45sixseven")); // 234567
        System.out.println(solution("123")); // 123
    }

}
