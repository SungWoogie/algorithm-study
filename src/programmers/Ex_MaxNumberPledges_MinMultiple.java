package programmers;

import java.util.Arrays;

public class Ex_MaxNumberPledges_MinMultiple {
    public static void main(String[] args) {
        int n = 1;
        int m = 10;
        System.out.println(Arrays.toString(solution(n, m)));

    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        int max = Math.max(n, m); // 12
        int min = Math.min(n, m); // 3

        while (min > 0) { // min 이 0보다 클때 까지 3
            int temp = min; // 임시변수에 작은 값 저장 3
            min = max % min; // 큰값에 작은값 나머지 값 저장 12 % 3 = 0
            max = temp; // 3
        }
        answer[0] = max; // 배열 앞에 최대공약수 저장
        answer[1] = n * m / max;

        return answer;
    }

}
