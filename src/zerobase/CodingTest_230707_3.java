package zerobase;

public class CodingTest_230707_3 {
    public static int solution(int N, int[] warriors) {
        int maxConfidence = 0;

        // 전사 수가 3 미만인 경우는 자신감 점수를 계산할 수 없으므로 0을 반환
        if (N < 3) {
            return maxConfidence;
        }

        // 한 명의 전사를 열외시키는 경우를 고려하여 모든 전사의 전투력을 확인하면서 자신감 점수를 계산
        for (int i = 0; i < N; i++) {
            int excludedWarrior = warriors[i];
            int confidence = 0;

            // 열외된 전사를 기준으로 배치를 조정하면서 자신감 점수 계산
            for (int j = 0; j < N - 1; j++) {
                int prev = warriors[(i + j) % N];
                int curr = warriors[(i + j + 1) % N];
                if (curr <= prev) { // 전투력이 같거나 높은 경우도 자신감 점수에 포함
                    confidence++;
                } else {
                    break; // 자신감이 없는 전사가 나오면 더 이상 계산하지 않음
                }
            }

            // 최댓값 갱신
            maxConfidence = Math.max(maxConfidence, confidence);
        }
        return maxConfidence;
    }

    public static void main(String[] args) {
        System.out.println(solution(8, new int[]{7, 7, 5, 8, 9, 4, 6, 2})); // 3
        System.out.println(solution(10, new int[]{5, 3, 7, 5, 3, 3, 6, 1, 8, 7})); // 3
        System.out.println(solution(12, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12})); // 1
    }
}
