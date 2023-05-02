package zerobase;

// 가상 대선 당선 시뮬레이션 프로그램

import java.util.*;

public class Test_6 {
    public static void main(String[] args) {
        Random random = new Random();

        Map<String, Integer> names = new LinkedHashMap<>() {
            {
                put("이재명", 0);
                put("윤석열", 0);
                put("심상정", 0);
                put("안철수", 0);
            }
        };

        long totalVoters = 100_000;

        for (int i = 1; i <= totalVoters; i++) {
            int index = random.nextInt(4);
            String name;
            if (index == 0) {
                name = "이재명";
                names.put("이재명", names.get("이재명") + 1);
            } else if (index == 1) {
                names.put("윤석열", names.get("윤석열") + 1);
                name = "윤석열";
            } else if (index == 2) {
                name = "심상정";
                names.put("심상정", names.get("심상정") + 1);
            } else {
                name = "안철수";
                names.put("안철수", names.get("안철수") + 1);
            }
            double voteRate = ((double) i / totalVoters) * 100.0; // 소수점 두번째 자리까지 뽑기
            System.out.printf("\n[투표진행율]: %.2f%%, %d명 투표 => %s\n", voteRate, i, name);

            int sequence = 1;
            for (Map.Entry<String, Integer> map : names.entrySet()) {
                double turnout = ((double) map.getValue() / totalVoters) * 100;
                System.out.printf("[기호:%d] %s: %.2f%%, (투표수: %d)\n", sequence, map.getKey(), turnout, map.getValue());
                sequence++;
            }
        }

        if (names.get("이재명").equals(names.get("윤석열")) && // 투표율 중복 시 throw new 발생
                names.get("윤석열").equals(names.get("심상정")) &&
                names.get("심상정").equals(names.get("안철수"))) {
            throw new IllegalArgumentException("투표수가 중복입니다.");
        }

        int president_elect = 0;
        for (Map.Entry<String, Integer> map : names.entrySet()) { // 투표율 최대값 찾기
            president_elect = Math.max(president_elect, map.getValue());
        }

        for (Map.Entry<String, Integer> map : names.entrySet()) { // 최대값과 같은 이름 출력
            if (president_elect == map.getValue()) {
                System.out.printf("[투표결과] 당선인: %s", map.getKey());
            }
        }
    }
}
