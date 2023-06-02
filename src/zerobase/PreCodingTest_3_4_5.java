package zerobase;

// 다리를 건널 수 있는지 없는지 판단.
public class PreCodingTest_3_4_5 {
    public static boolean solution(int[] bridge, int jumpSize) {
        int zerosCount = 0;

        for (int i = 0; i < bridge.length; i++) {
            if (bridge[i] == 1) {
                int j = i + 1;
                while (j < bridge.length && bridge[j] == 0) {
                    zerosCount++;
                    j++;
                }
                if (zerosCount > jumpSize) {
                    return false;
                }
                zerosCount = 0;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 0, 1, 0, 1, 0}, 2)); // true
    }
}

