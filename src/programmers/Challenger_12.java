package programmers;

public class Challenger_12 {
    public static void main(String[] args) {
        int n = 123;
        int num = solution(n);
        System.out.println(num);
    }

    public static int solution(int n) {

        int sum = 0;

        while (n > 0) {
            int num = n % 10; // 7 8 9
            n /= 10; // 98 9
            sum += num;
        }
        return sum;
    }
}
