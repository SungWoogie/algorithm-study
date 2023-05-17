package zerobase;

public class PreCodingTest_230517_3 {
    public static int solution(int[] A) {
        int gcd = A[0]; // 초기값으로 첫 번째 요소를 선택
        for (int i = 1; i < A.length; i++) {
            gcd = findGCD(gcd, A[i]); // 현재 최대 공약수와 다음 요소의 최대 공약수를 구함
        }
        return gcd;
    }

    // 두 수의 최대 공약수를 구하는 메소드
    private static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{6, 12, 4}));
    }

}
