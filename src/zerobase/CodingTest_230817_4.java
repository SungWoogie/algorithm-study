package zerobase;

import java.util.Arrays;

public class CodingTest_230817_4 {
    public static int solution(int money, int[] chips) {
        int count = 0;
        Arrays.sort(chips);

        while (money > 0) {
            for (int i = chips.length - 1; i >= 0; i--) {
                if (money >= chips[i]) {
                    count++;
                    money -= chips[i];
                    break;
                } else {
                    continue;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(solution(3000, new int[]{1100, 500, 200, 150, 25}));
    }

}
