package programmers;
// Lv 0 : 분수의 덧셈

import java.util.Arrays;

public class P230428 {
    /*
    1 3
    2 4
     */
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numerator = (numer1 * denom2) + (numer2 * denom1);
        int denominator = denom1 * denom2;

        for (int i = numerator - 1; i > 1; i--) {
            // 기약분수로 만들기
            if (numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i;
            }
        }
        return new int[]{numerator, denominator};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(1, 2, 3, 4)));
        System.out.println(Arrays.toString(solution(9, 2, 1, 3)));
    }
}
