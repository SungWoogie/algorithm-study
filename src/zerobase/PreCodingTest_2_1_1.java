package zerobase;

import java.util.Arrays;

// 삼각형 둘레 제일 큰 값 구하기
public class PreCodingTest_2_1_1 {
    public static int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr); // 배열을 오름차순으로 정렬

        for (int i = arr.length - 1; i >= 2; i--) {
            int a = arr[i]; // 제일 큰 값
            int b = arr[i - 1]; // 두번째 큰 값
            int c = arr[i - 2]; // 세번째 큰 값

            if (a + b > c && b + c > a && c + a > b) { // 삼각형을 만들 수 있는지 확인
                int perimeter = a + b + c;
                answer = Math.max(perimeter, answer);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{6, 2, 12, 8, 5, 9})); // 29
        System.out.println(solution(new int[]{5, 19, 4, 23, 198, 34})); // 76
        System.out.println(solution(new int[]{1, 2, 5, 60, 50, 7})); // 0

    }
}
