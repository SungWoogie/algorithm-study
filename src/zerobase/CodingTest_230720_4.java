package zerobase;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingTest_230720_4 {
    public static int[] solution(String nums) {
        List<Integer> result = new ArrayList<>();
        backtrack(nums, 0, result);
        return listToArray(result);
    }

    private static boolean backtrack(String nums, int index, List<Integer> current) {
        if (index == nums.length() && current.size() >= 3) {
            return true;
        }

        for (int i = index; i < nums.length(); i++) {
            String currentStr = nums.substring(index, i + 1);
            if (currentStr.length() > 1 && currentStr.startsWith("0")) {
                break;
            }

            BigInteger currentValue = new BigInteger(currentStr);
            if (currentValue.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) {
                break;
            }

            int size = current.size();
            if (size >= 2) {
                int sum = current.get(size - 1) + current.get(size - 2);
                if (currentValue.compareTo(BigInteger.valueOf(sum)) > 0) {
                    break;
                } else if (currentValue.compareTo(BigInteger.valueOf(sum)) < 0) {
                    continue;
                }
            }

            current.add(currentValue.intValue());
            if (backtrack(nums, i + 1, current)) {
                return true;
            }
            current.remove(current.size() - 1);
        }

        return false;
    }
    private static int[] listToArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(String.valueOf(14152944))));
    }

}
