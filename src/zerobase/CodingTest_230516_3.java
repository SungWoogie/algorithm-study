package zerobase;

// 주식
public class CodingTest_230516_3 {
    public static int solution(int[] A) {
        int answer = 0;

        int minPrice = Integer.MAX_VALUE; // int 의 최대값

        for (int i : A) {
            if (i < minPrice) {
                minPrice = i; // 현재 가격 중 가장 낮은 가격 업데이트
            } else {
                int profit = i - minPrice; // 현재 가격에서 가장 낮은 가격을 뺀 수익 계산
                answer = Math.max(answer, profit); // 최대 수익 업데이트
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{100_000, 99_000, 99_000, 98_000, 97_000})); // 0
        System.out.println(solution(new int[]{100_000, 98_000, 95_000, 98_000, 92_000})); // 3000

    }

}
