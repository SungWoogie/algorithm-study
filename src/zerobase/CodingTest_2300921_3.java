package zerobase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CodingTest_2300921_3 {

  public static int solution(int[] nums) {
    Map<Integer, Integer> digitSumMap = new HashMap<>();
    int maxSum = -1;

    for (int num : nums) {
      int sum = getDigitSum(num);

      if (digitSumMap.containsKey(sum)) {
        int prev = digitSumMap.get(sum);
        maxSum = Math.max(maxSum, prev + num);
        digitSumMap.put(sum, Math.max(prev, num));
      } else {
        digitSumMap.put(sum, num);
      }
    }

    return maxSum;
  }

  private static int getDigitSum(int num) {
    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(solution(new int[]{18, 36, 72, 16, 52})); // 108

  }

}
