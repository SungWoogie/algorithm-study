package review;

import java.util.ArrayList;
import java.util.List;

public class Pro_1_Review {
    public static void main(String[] args) {
        long n = 12345;
        System.out.println(solution(n));
    }

    public static List<Long> solution(long n) {
        List<Long> answer = new ArrayList<>();

        while (n > 0) {
            long num = n % 10;
            answer.add(num);
            n /= 10;
        }
        return answer;
    }
}
