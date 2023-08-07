package zerobase;

import java.util.Arrays;

public class CodingTest_230807_2 {
    public static int solution(int N, int[] cards) {
        int totalSum = Arrays.stream(cards).sum(); // 카드 숫자의 총합

        int halfSum = totalSum / 2; // 총합의 절반

        boolean[] dp = new boolean[halfSum + 1]; // dp[i]는 합이 i가 가능한지를 나타냄
        dp[0] = true; // 0은 항상 가능한 합

        for (int num : cards) {
            for (int j = halfSum; j >= num; j--) {
                dp[j] |= dp[j - num];
            }
        }

        int minPenalty = 0;
        for (int i = halfSum; i >= 0; i--) {
            if (dp[i]) {
                minPenalty = totalSum - 2 * i; // 두 그룹의 차이
                break;
            }
        }

        return minPenalty;
    }


    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{1, 3, 5, 6, 7, 10})); // 0
        System.out.println(solution(10, new int[]{19, 7, 18, 12, 15, 2, 17, 7, 20, 8})); // 1
    }

}
