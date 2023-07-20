package zerobase;

public class CodingTest_230720_5 {
    public static int solution(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n + 1];
        int maxScore = 0;

        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int minElement = Integer.MAX_VALUE;
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                    minElement = Math.min(minElement, nums[k]);
                }
                int score = sum * minElement;
                maxScore = Math.max(maxScore, score);
            }
        }

        return maxScore;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 5, 10, 9, 8, 5}));
    }

}
