package programmers;

import java.util.Arrays;

public class Pro_220527 { // 예산
    public static int solution(int[] arr, int budget) {
        Arrays.sort(arr);   // 먼저 오름차순으로 정렬하여
                            // 낮은 값 부터 차례대로 빼는 것이 효율적이라고 판단했다.
        int answer = 0;

        for (int j : arr) { // 파라미터로 받은 값에 정렬 해놓은 배열의 작은 값 부터 하나씩 빼본다.
            budget -= j;
            if (budget < 0) { // 0 보다 값이 작아 졌다면 값을 이미 초과한 것이므로 break
                break;
            } else { // 0 보다 작지 않다면 더 할때 마다 ++을 해준다.
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        // 도움 코드
        int[] arr = new int[]{2, 2, 3, 3};
        int budget = 10;

        System.out.println(solution(arr, budget));
    }

}
