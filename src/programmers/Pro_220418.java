package programmers;

import java.util.Arrays;

public class Pro_220418 {
    public static void main(String[] args) {
        int n = 2;
        int m = 5;

        System.out.println(Arrays.toString(solution(n, m)));


    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        int a = Math.max(n, m);
        int b = Math.min(n, m);

        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        answer[0] = a;
        answer[1] = (n * m) / a;

        return answer;
    }
}
