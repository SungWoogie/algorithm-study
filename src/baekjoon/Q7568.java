package baekjoon;

import java.util.*;

public class Q7568 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 인원 입력

        List<List<Integer>> users = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> profile = new ArrayList<>();
            profile.add(scanner.nextInt()); // [몸무게]
            profile.add(scanner.nextInt()); // [키]
            users.add(profile); // 프로필 저장 [몸무게, 키]
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < users.size(); i++) {
            int count = 1; // 등수 초기값 1부터 시작
            for (int j = 0; j < users.size(); j++) {
                if (i != j){ // i 와 j 가 같지 않을 때만 비교
                    if (users.get(i).get(0) < users.get(j).get(0) && users.get(i).get(1) < users.get(j).get(1)) {
                        count++;
                    }
                }
            }
            sb.append(count).append(" ");
        }
        System.out.println(sb);
    }
}
