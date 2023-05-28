package zerobase;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// 제일 큰 값 두개 뽑아서 마지막에 남는 카드 찾기
public class PreCodingTest_2_5_3 {
    public static int solution(int[] cards) {
        int answer = 0;
        List<Integer> list = new LinkedList<>();
        for (int card : cards) {
            list.add(card);
        }
        while (list.size() > 1) {
            list.sort(Collections.reverseOrder());
            int firstMax = list.remove(0);
            int secondMax = list.remove(0);
            if (firstMax != secondMax) {
                int difference = firstMax - secondMax;
                list.add(difference);
            }
        }
        if (list.isEmpty()) {
            return 0;
        } else {
            answer = list.get(0);
        }
        return answer;
    }



    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 8, 6, 1, 2})); // 1
        /*
        1. 제일 큰 숫자 두개씩 뽑기
            1. 제일 큰 값 뽑가
            2. 두번째로 큰 값 뽑기
        2. 두개의 값을 빼서 해당 값 저장하기
        3. 마지막 숫자가 나올 때 까지 반복
         */
    }
}

