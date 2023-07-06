package zerobase;
// 틀린 코드
import java.util.Arrays;

public class CodingTest_230706_5 {
    public static int solution(int N, int M, int[] fry, int[] clean) {
        int[] totalTime = new int[N];
        int minTime = Integer.MAX_VALUE;

        // 각 자동 튀김기의 튀기기 + 세척 시간을 계산하여 최소 시간을 구함
        for (int i = 0; i < N; i++) {
            int time = 0;
            int count = 0;
            for (int j = 0; j < M; j++) {
                time += fry[i];
                count++;
                if (count == M) {
                    break;
                }
                time += clean[i];
            }
            totalTime[i] = time;
            minTime = Math.min(minTime, time);
        }

        // 모든 자동 튀김기를 사용하여 튀김하는 경우의 시간을 계산
        int totalFryTime = Arrays.stream(fry).sum() * (M / N);
        int totalCleanTime = Arrays.stream(clean).sum() * (M / N);
        int remainder = M % N;
        for (int i = 0; i < remainder; i++) {
            totalFryTime += fry[i];
            totalCleanTime += clean[i];
        }
        int totalTimeUsingAllFryers = totalFryTime + totalCleanTime;

        return Math.min(minTime, totalTimeUsingAllFryers);
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 20, new int[]{3, 6}, new int[]{2, 1})); // 58
    }
}