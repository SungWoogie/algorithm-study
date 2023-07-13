package zerobase;

import java.util.Arrays;

public class CodingTest_230713_1 {
    public static int[] solution(int[] values) {
        int[] answer = new int[2];
        int start = 0;  // 구간의 시작 인덱스
        int end = 0;    // 구간의 끝 인덱스
        int maxLength = 0;  // 가장 오랫동안 단조 증가하는 구간의 길이
        int currentStart = 0;  // 현재 구간의 시작 인덱스
        int currentLength = 0; // 현재 구간의 길이

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] < values[i + 1]) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    start = currentStart;
                    end = i + 1;
                }
            } else {
                currentStart = i + 1;
                currentLength = 0;
            }
        }

        if (maxLength == 0) {
            start = 0;
            end = 0;
        }
        answer[0] = start;
        answer[1] = end;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(
                new int[]{103, 152, 124, 165, 152, 154, 159, 160, 200, 195, 205, 206, 204, 189, 156}))); // {4, 8}
    }

}
