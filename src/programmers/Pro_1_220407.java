package programmers;

import java.util.Arrays;

public class Pro_1_220407 {

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];

        long sum = 0;
        for (int i = 0; i < answer.length; i++) {
            sum += x;
            answer[i] = sum;
        }
        return answer;
    }


    public static void main(String[] args) {
        int x = -1000000000;
        int n = 3;

        System.out.println(Arrays.toString(solution(x, n)));
    }
}
