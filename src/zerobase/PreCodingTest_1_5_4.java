package zerobase;

import java.util.Stack;

public class PreCodingTest_1_5_4 {
    public static int solution(int n) {
        if (n < 0) {
            return 0;
        }

        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt == n) { // 제곱근 값을 곱했을 때 n 이 나오면 해당 sqrt 반환
            return sqrt;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(4)); // 2
        System.out.println(solution(6)); // 0
    }

}
