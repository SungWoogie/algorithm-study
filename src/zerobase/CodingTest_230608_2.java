package zerobase;

import java.util.*;

public class CodingTest_230608_2 {
    public static int solution(String[] names) {

        Set<String> set = new HashSet<>(Arrays.asList(names));
        int totalParticipant = set.size();
        int winningCount = 4;

        long numerator = 1;
        long denominator = 1;
        for (int i = 0; i < winningCount; i++) {
            numerator *= totalParticipant - i;
            denominator *= (i + 1);
        }

        return (int) (numerator / denominator);
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]
                {"제로", "베이스", "자바", "스쿨", "자바", "베이스", "베이스", "백엔드", "화이팅"})); // 15

    }
}
