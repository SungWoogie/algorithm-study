package zerobase;

import java.util.Arrays;

// 문제 이해 못했슴 fail
public class CodingTest_230605_2 {
    public static int solution(int N, int[] arr) {
        Arrays.sort(arr); // 난이도를 오름차순으로 정렬
        int maxDiff = 0;

        for (int i = 0; i < N / 2; i++) {
            int diff = arr[N - 1 - i] - arr[i];
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{1, 5, 3, 9, 2})); // 6
        System.out.println(solution(7, new int[]{1, 5, 7, 2, 4, 6, 3})); // 2
    }
}

