package zerobase;

public class CodingTest_230608_5 {
    public static long solution(int N, int M, int K, int[] capacity) {
        long studentCases = calculatePermutation(capacity);
        long supervisorCases = calculateCombination(M, K);
        return studentCases * supervisorCases;
    }

    public static long calculatePermutation(int[] capacity) {
        long result = 1;
        for (int i = 0; i < capacity.length; i++) {
            result *= calculateFactorial(capacity[i]);
        }
        return result;
    }

    public static long calculateFactorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static long calculateCombination(int M, int K) {
        long numerator = calculateFactorial(M);
        long denominator = calculateFactorial(K) * calculateFactorial(M - K);
        return numerator / denominator;
    }


    public static void main(String[] args) {
        System.out.println(solution(10, 3, 4, new int[]{3, 3, 4})); // 100_800

    }
}
