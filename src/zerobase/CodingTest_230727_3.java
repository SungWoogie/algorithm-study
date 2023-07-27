package zerobase;

public class CodingTest_230727_3 {
    public static int solution(int N, int[] rewards) {
        if (N <= 0 || rewards == null || rewards.length == 0) {
            return 0;
        }

        int prev = rewards[0];
        int current = Math.max(rewards[1], rewards[0]);

        for (int i = 2; i < N; i++) {
            int newMax = Math.max(current, prev + rewards[i]);
            prev = current;
            current = newMax;
        }

        return current;
    }


    public static void main(String[] args) {
        System.out.println(solution(6, new int[]{5, 10, 5, 7, 5, 9})); // 26
    }

}
