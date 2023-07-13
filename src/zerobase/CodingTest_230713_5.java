package zerobase;

import java.util.Arrays;

public class CodingTest_230713_5 {
    public static int[] solution(int[] scores) {
        int n = scores.length;
        int[] chocolates = new int[n];
        chocolates[0] = 1;

        // 왼쪽에서 오른쪽으로 진행하여 초콜렛 개수 계산
        for (int i = 1; i < n; i++) {
            if (scores[i] > scores[i - 1]) {
                chocolates[i] = chocolates[i - 1] + 1;
            } else {
                chocolates[i] = 1;
            }
        }

        // 오른쪽에서 왼쪽으로 진행하여 초콜렛 개수 조정
        for (int i = n - 2; i >= 0; i--) {
            if (scores[i] > scores[i + 1] && chocolates[i] <= chocolates[i + 1]) {
                chocolates[i] = chocolates[i + 1] + 1;
            }
        }
        return chocolates;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 5, 4, 5, 5, 5, 1}))); // 1,2,3,1,2,1,2,1
    }

}
