package programmers;

import java.util.Arrays;

public class Challenger_1 {
    public static void main(String[] args) {
        int x = -4;
        int n = 2;

        long[] answer = solution(x, n);
        System.out.println(Arrays.toString(answer));
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = (long) x * i + x;
        }
        return answer;
    }
}
