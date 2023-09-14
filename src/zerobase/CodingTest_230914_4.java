package zerobase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
// X
public class CodingTest_230914_4 {
    public static int solution(int[] numsDivide, int[] numsDivided) {
        // numsDivide 배열을 오름차순으로 정렬
        Arrays.sort(numsDivide);

        int minRemovals = Integer.MAX_VALUE; // 최소 원소 제거 횟수 초기화

        // numsDivide 배열에서 각 숫자를 선택하여 모든 숫자가 나누어 떨어지게 하는 경우를 탐색
        for (int i = 0; i < numsDivide.length; i++) {
            int currentRemovals = 0; // 현재 원소 제거 횟수 초기화
            Map<Integer, Integer> currentDividedCount = new HashMap<>();

            // numsDivided 배열의 숫자 개수를 맵에 저장
            for (int num : numsDivided) {
                currentDividedCount.put(num, currentDividedCount.getOrDefault(num, 0) + 1);
            }

            // numsDivide 배열에서 i번째 원소부터 마지막 원소까지 선택
            for (int j = i; j < numsDivide.length; j++) {
                int num = numsDivide[j];

                if (currentDividedCount.containsKey(num) && currentDividedCount.get(num) > 0) {
                    // 현재 숫자로 나누어 떨어지는 경우
                    currentDividedCount.put(num, currentDividedCount.get(num) - 1);
                } else {
                    // 현재 숫자로 나누어 떨어지지 않는 경우
                    currentRemovals++;
                }

                // 모든 숫자가 나누어 떨어지면 최소 제거 횟수 갱신
                if (currentDividedCount.isEmpty()) {
                    minRemovals = Math.min(minRemovals, currentRemovals);
                    break;
                }
            }
        }

        return minRemovals == Integer.MAX_VALUE ? -1 : minRemovals;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 9, 3, 6, 2, 4, 3}, new int[]{9, 18, 27, 9, 15}));
    }

}
