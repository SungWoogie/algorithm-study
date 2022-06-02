package programmers;

import java.util.Arrays;

public class Pro_220602 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4};
        int num = 9;
        System.out.println(solution(arr, num));

    }

    public static int solution(int[] arr, int budget) {

        Arrays.sort(arr); // 낮은 값 부터 더해주기 위해 오름차순으로 정렬
        int answer = 0;
        int sum = 0;

        for (int j : arr) { // 값 하나씩 가져와서 더한다.
            sum += j;
            if (sum <= budget) { // 더한 값이 작거나 같으면 ++
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }
}
