package zerobase;

import java.util.Arrays;

public class CodingTest_230706_4 {
    public static int solution(int N, int[] branches) {
        // 나뭇가지 길이 배열을 오름차순으로 정렬
        Arrays.sort(branches);

        // 이진 탐색을 활용하여 교보재용 나뭇가지의 최대 길이를 찾음
        int left = 0;
        int right = branches[branches.length - 1];
        int maxWorkbookLength = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canMakeWorkbooks(mid, N, branches)) {
                maxWorkbookLength = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return maxWorkbookLength;
    }

    public static boolean canMakeWorkbooks(int length, int N, int[] branches) {
        int count = 0;
        for (int branch : branches) {
            count += branch / length;
        }
        return count >= N;
    }

    public static void main(String[] args) {
        System.out.println(solution(10, new int[]{6, 7, 10, 16, 12})); // 4
    }
}