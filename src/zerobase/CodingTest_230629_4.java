package zerobase;

import java.util.Arrays;
// 틀림
public class CodingTest_230629_4 {
    public static int[] solution(int[] start, int[] time) {
        int n = start.length;

        // 작업 인덱스를 포함한 배열 생성
        int[] jobs = new int[n];
        for (int i = 0; i < n; i++) {
            jobs[i] = i;
        }

        // 작업을 처리하는 데 걸리는 시간에 따라 정렬
        // 동일한 시간인 경우 인덱스가 작은 작업을 선택
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (time[j] > time[j + 1] || (time[j] == time[j + 1] && jobs[j] < jobs[j + 1])) {
                    int temp = jobs[j];
                    jobs[j] = jobs[j + 1];
                    jobs[j + 1] = temp;
                }
            }
        }

        int[] result = new int[n];
        int index = 0;
        int currentTime = 0;

        // 작업 스케줄링 수행
        for (int i = 0; i < n; i++) {
            int jobIndex = jobs[i];
            result[index++] = jobIndex;
            currentTime = Math.max(currentTime, start[jobIndex]) + time[jobIndex];
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(
                new int[]{0, 2, 3, 5, 6},
                new int[]{2, 4, 2, 1, 3}))); // {0,1,3,2,4}
    }
}