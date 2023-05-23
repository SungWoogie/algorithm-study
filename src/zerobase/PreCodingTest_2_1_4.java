package zerobase;

import java.util.HashMap;
import java.util.Map;

// 문자열 갯수 세기 같은 값 1개로 만들기
public class PreCodingTest_2_1_4 {
    public static int solution(String s) {
        int answer = 0;

        Map<String, Integer> map = new HashMap<>();
        for (String str : s.split(" ")) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if (m.getValue() > 1) {
                map.put(m.getKey(), 1);
            }
            answer += m.getValue();
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("Hello world Nice world")); // 3
    }
}
