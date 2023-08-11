package zerobase;

public class CodingTest_230811_4 {
    public static boolean solution(int[] param0) {
        int maxReach = 0;

        for (int i = 0; i < param0.length; i++) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + param0[i]);
            if (maxReach >= param0.length - 1) {
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 1, 1, 0, 3}));
    }

}
