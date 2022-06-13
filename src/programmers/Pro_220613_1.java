package programmers;

import java.util.Arrays;

public class Pro_220613_1 { // 최대공약수와 최대공배수
    public static void main(String[] args) {
        int n = 3;
        int m = 12;
        System.out.println(Arrays.toString(solution(n, m)));
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        int max = Math.max(n, m);
        int min = Math.min(n, m);
        answer[0] = gcd(max, min);
        answer[1] = max * min / answer[0];

        return answer;
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
