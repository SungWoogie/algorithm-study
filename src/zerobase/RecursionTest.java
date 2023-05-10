package zerobase;

public class RecursionTest {
    static int recursion(int n) {
        if (n == 1) {
            return 1;
        }
        return 3 * recursion(n - 1);
    }

    static int recursion1(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursion1(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("== 점화식 / 재귀함수 연습 1==");
        // 1 3 9 27 ... 의 n 번째 수

        int n = 4;
        int result = 1;
        for (int i = 1; i < n; i++) {
            result *= 3;
        }
        System.out.println("result = " + result);

        System.out.println("== 점화식 / 재귀함수 2 ==");
        // 1 2 3 4 5 6 ... 의 n 번째 까지의 합
        n = 5;
        result = 0;
        for (int i = 1; i < n + 1; i++) {
            result += i;
        }
        System.out.println("result = " + result);
        System.out.println(recursion1(n));
    }
}
