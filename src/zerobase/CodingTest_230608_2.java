package zerobase;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class CodingTest_230608_2 {
    public static int solution(String[] names) {

        Set<String> set = new LinkedHashSet<>();
        Collections.addAll(set, names);

        int totalParticipant = set.size();
        int winningCount = 4;

        return calculateCombination(totalParticipant, winningCount);
    }

    public static int calculateCombination(int total, int winning) {
        int[][] dp = new int[total + 1][winning + 1];

        for (int i = 0; i <= total; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= total; i++) {
            for (int j = 1; j <= winning; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        return dp[total][winning];
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]
                {"제로", "베이스", "자바", "스쿨", "자바", "베이스", "베이스", "백엔드", "화이팅"})); // 15

    }
}
