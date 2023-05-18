package zerobase;

import java.util.HashMap;
import java.util.Map;

public class PreCodingTest_230518_5 {
    public static String solution(String[] bj, String[] one, String[] two) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();

        // 초기화: 모든 참가자의 짜장면 그릇 수를 0으로 설정
        for (String plateCount : bj) {
            map.put(plateCount, 0);
        }

        // 짜장면 그릇 수 계산
        for (String name : one) {
            map.put(name, map.get(name) + 1);
        }
        for (String name : two) {
            map.put(name, map.get(name) + 2);
        }


        // 우승자 찾기
        String winner = null;
        int count = 3;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                winner = entry.getKey();
            }
            count += entry.getValue();
        }

        // 총 상금 계산
        int totalPrize = count * 150;

        answer = totalPrize + "만원(" + winner + ")";
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(
                new String[]{"혁준", "하밥", "양상", "심심이", "소스왕"},
                new String[]{"혁준", "양상"},
                new String[]{"심심이", "소스왕"})); // 1350만원(하밥)
    }
}