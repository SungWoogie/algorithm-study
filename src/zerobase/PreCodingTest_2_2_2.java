package zerobase;

import java.util.*;

public class PreCodingTest_2_2_2 {
    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int index = 0; // 결과 배열의 인덱스
        int prevEven = -1; // 이전 짝수 값 초기화

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { // 짝수인 경우
                prevEven = arr[i]; // 이전 짝수 값을 저장
            } else { // 홀수인 경우
                if (prevEven != -1) { // 이전 짝수 값이 있는 경우
                    for (int j = 0; j < prevEven; j++) {
                        if (index >= answer.length) {
                            break; // 결과 배열의 길이를 초과하는 경우 반복 종료
                        }
                        answer[index++] = arr[i]; // 이전 짝수 값 만큼 홀수 값을 추가
                    }
                    prevEven = -1; // 이전 짝수 값 초기화
                }
                if (index < answer.length) {
                    answer[index++] = arr[i]; // 홀수 값을 추가
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0, 2, 1, 4, 3, 0}))); // 0,2,1,1,4,3
    }
}
//import java.util.*;
//
//class Solution {
//    public static int[] solution(int[] arr) {
//        int[] answer = new int[arr.length];
//        List<Integer> list = new ArrayList<>();
//
//        for (int i : arr) {
//            list.add(i);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (list.get(i) % 2 == 1) { // 홀수면
//                list.add(i, list.get(i));
//                list.remove(list.size() - 1);
//                break;
//            }
//        }
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = list.get(i);
//        }
//
//        return answer;
//    }
//
//}
//
//// {0,2,1,4,3,0}
//// 0,2,1,1,4,3