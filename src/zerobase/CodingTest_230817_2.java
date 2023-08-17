package zerobase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingTest_230817_2 {
    public static int[] solution(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(String.valueOf(i));
        }

        list.sort((a, b) -> (a + b).compareTo(b + a));

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.parseInt(list.get(i));
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(15))); // 1, 10, 11, 12, 13, 14, 15, 2, 3, 4, 5, 6, 7, 8, 9
    }

}
