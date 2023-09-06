package zerobase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingTest_2300906_2 {
    public static int[] solution(int[] x, int[] y, int n) {
        int xLen = x.length;
        int yLen = y.length;
        int[] result = new int[n];

        for (int i = Math.max(0, n - yLen); i <= Math.min(n, xLen); i++) {
            int[] merged = mergeArrays(x, y, i, n - i);
            if (isGreater(merged, 0, result, 0)) {
                result = merged;
            }
        }

        return result;
    }

    private static int[] mergeArrays(int[] x, int[] y, int xCount, int yCount) {
        List<Integer> mergedList = new ArrayList<>();
        int xIndex = 0;
        int yIndex = 0;

        while (xCount > 0 || yCount > 0) {
            if (xCount > 0 && isGreater(x, xIndex, y, yIndex)) {
                mergedList.add(x[xIndex]);
                xIndex++;
                xCount--;
            } else {
                mergedList.add(y[yIndex]);
                yIndex++;
                yCount--;
            }
        }

        int[] mergedArray = new int[mergedList.size()];
        for (int i = 0; i < mergedList.size(); i++) {
            mergedArray[i] = mergedList.get(i);
        }

        return mergedArray;
    }

    private static boolean isGreater(int[] x, int xIndex, int[] y, int yIndex) {
        while (xIndex < x.length && yIndex < y.length) {
            if (x[xIndex] > y[yIndex]) {
                return true;
            } else if (x[xIndex] < y[yIndex]) {
                return false;
            }
            xIndex++;
            yIndex++;
        }
        return xIndex < x.length;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(
                new int[]{8, 5, 6, 9, 2, 4},
                new int[]{5, 2, 4, 5, 6, 2, 5}, 10))); // 9,5,2,4,5,6,2,5,2,4

        System.out.println(Arrays.toString(solution(
                new int[]{4, 9, 6, 8, 1, 9, 4, 4, 5, 8},
                new int[]{4, 6, 8, 2, 5, 4, 3, 2, 8, 9}, 7))); // 9,9,9,4,4,5,8
    }

}
