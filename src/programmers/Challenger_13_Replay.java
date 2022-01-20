package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Challenger_13_Replay {
    public static void main(String[] args) {
        long n = 118372;
        System.out.println(solution(n));

    }

    public static long solution(long n) {
        List<Long> list = new ArrayList<>();

        int count = 0;
        while (n > 0) {
            list.add(n % 10);
            n /= 10;
            count++;
        }
        Collections.sort(list);
        Collections.reverse(list);

        long value = 0;
        for (long a : list) {
            value += a * (long) Math.pow(10, count - 1);
            count--;
        }
        return value;
    }
}
