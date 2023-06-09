package zerobase;

import java.util.Arrays;

// 맥주 문제
public class CodingTest_230608_3 {
    public static int solution(int N) {
        int a = 1;
        int b = 2;
        if (N == 1) {
            return a;
        }
        for (int i = 3; i <= N; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static int solution2(int N) {
        if (N <= 2) {
            return N;
        }
        return solution2(N - 1) + solution2(N - 2);
    }

    public static void main(String[] args) {
        System.out.println(solution(4)); // 5
        System.out.println(solution2(4)); // 5

    }
}
