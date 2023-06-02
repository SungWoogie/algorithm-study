package zerobase;

import java.util.Arrays;

// 훔칠 수 있는 보석의 최대 개수
public class PreCodingTest_3_5_4 {
    public static int solution(int[] A, int K) {
        Arrays.sort(A);
        int sum = 0;
        int answer = 0;

        for (int jewel : A) {
            if (sum + jewel <= K) {
                sum += jewel;
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}, 15)); // 5
    }
}

