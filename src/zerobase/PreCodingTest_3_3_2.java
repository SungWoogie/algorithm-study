package zerobase;

import java.util.Arrays;

// 필요한 보트의 최소 횟수
public class PreCodingTest_3_3_2 {
    public static int solution(int[] people, int limit) {
            Arrays.sort(people);

            int count = 0;
            int left = 0;
            int right = people.length - 1;

            while (left <= right) {
                if (people[left] + people[right] <= limit) {
                    left++;
                }
                right--;
                count++;
            }
            return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{45, 50, 51, 49, 90, 70}, 100)); // 4
    }
}

