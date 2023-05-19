package zerobase;

import java.util.ArrayList;
import java.util.List;

public class PreCodingTest_230519_3 {
    public static int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i * i != n) {
                    list.add(i);
                }
                list.add(n / i);
            }
        }
        answer = list.size();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10)); // 4
    }

}
