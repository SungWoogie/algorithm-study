package zerobase;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CodingTest_230817_3 {
    public static boolean solution(String s, String[] words) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }


    public static void main(String[] args) {
        System.out.println(solution("zerobase", new String[]{"zer", "ro", "ze", "base"}));
    }

}
