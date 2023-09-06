package zerobase;

public class CodingTest_2300906_3 {
    public static boolean solution(int target, int r) {
        boolean[] dp = new boolean[target + 1];

        for (int i = 1; i <= target; i++) {
            dp[i] = false; // 초기화: 일단 패배 상태로 설정

            for (int j = 1; j <= r && j <= i; j++) {
                if (!dp[i - j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[target]; // 승자 판단을 변경하지 않고 true를 반환합니다.
    }


    public static void main(String[] args) {
        System.out.println(solution(10, 3)); // false
        System.out.println(solution(5, 3)); // true

    }

}
