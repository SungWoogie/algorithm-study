package zerobase;

// 만들 수 있는 최고의 점수
public class PreCodingTest_3_3_5 {
    public static int solution(int[] fruits) {
        int answer = Integer.MIN_VALUE;
        int currentScore = 0;

        for (int fruit : fruits) {
            currentScore = Math.max(fruit, currentScore + fruit);
            answer = Math.max(answer, currentScore);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-2, 5, -3, 6, 8, -1, -5,3})); // 16
    }
}

