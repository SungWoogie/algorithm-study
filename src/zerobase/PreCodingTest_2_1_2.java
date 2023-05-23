package zerobase;

// 최소값 최대값 사이에 값들 평균 구하기
import java.util.Arrays;

public class PreCodingTest_2_1_2 {
    public static int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr); // 배열 정렬
        int sum = 0;
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) { // 최소값, 최대값 빼고 더하기
            sum += arr[i];
            count++;
        }
        double average = (double) sum / count;
        answer = (int) Math.floor(average);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 3, 3, 3, 20})); // 3
        System.out.println(solution(new int[]{9, 4, 7, 6, 10, 4})); // 6

    }
}
