package zerobase;

// 연속 합이 가장 큰 수열의 합을 반환
public class PreCodingTest_3_4_2 {
    public static int solution(int[] A) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : A) {
            currentSum += num;

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return Math.max(maxSum, 0);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,-8,3,-2,4,-10})); // 5
    }
}

