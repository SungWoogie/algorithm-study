package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pro_220524 {   // 나머지가 1이 되는 수 찾
    public static void main(String[] args) {
        int n = 12;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer;
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 1) {
                list.add(i);
            }
        }
        Collections.sort(list);
        answer = list.get(0);

        return answer;
    }
}
