package programmers;

import java.util.Arrays;

public class Challenger_6 {
    public static void main(String[] args) {

        long num = 84579;
        int[] result = solution(num);

        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(long n) {
        String str = String.valueOf(n);

        int count = 0;
        int[] answer = new int[str.length()];

        while (0 < n) {
            answer[count] = (int) (n % 10);
            n /= 10;
            count++;
        }
        return answer;
    }
}
