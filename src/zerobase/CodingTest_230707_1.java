package zerobase;

import java.util.Arrays;

public class CodingTest_230707_1 {
    public static int solution(int[] arrive, int[] patience) {
        int n = arrive.length;
        int count = 0;
        int[] waitTimes = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                visited[i] = true;
                int waitTime = patience[i];

                for (int j = i + 1; j < n; j++) {
                    if (!visited[j] && arrive[j] <= arrive[i] + waitTime && waitTime >= arrive[j] - arrive[i]) {
                        visited[j] = true;
                        waitTimes[j] = Math.max(waitTimes[j], waitTime - (arrive[j] - arrive[i]));
                    }
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{12, 4, 5, 2, 7, 16}, new int[]{4, 6, 1, 3, 3, 2})); // 4
        System.out.println(solution(new int[]{9, 3, 8, 5, 7, 0}, new int[]{3, 1, 3, 1, 2, 2, 3})); // 4
    }
}