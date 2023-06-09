package zerobase;

import java.util.Arrays;

// n 보다 작은 소수 찾기
public class CodingTest_230608_1 {
    public static int solution(int n) {
        int[] arr = new int[n];
        for (int i = 2; i < n; i++) {
            arr[i] = 1;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) { // 이미 검사된 숫자의 배수는 무의미
            if (arr[i] == 0) {
                continue;
            }
            int num = i * 2;
            while (num < n) {
                arr[num] = 0;
                num += i;
            }
        }
        return Arrays.stream(arr).sum();
    }

    public static void main(String[] args) {
        System.out.println(solution(15)); // 6

    }
}
