package zerobase;

public class PreCodingTest_1_5_2 {
    public static boolean solution(int n) {
        boolean answer = true;
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(7)); // true
    }

}
