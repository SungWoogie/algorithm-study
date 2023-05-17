package zerobase;

import java.util.HashSet;
import java.util.Set;

public class PreCodingTest_230517_4 {
    public static int solution(int[] orders, int n) {
        int answer = 0;
        Set<Integer> canceledOrders = new HashSet<>();

        // orders 배열의 주문 번호를 canceledOrders 집합에 추가
        for (int order : orders) { // 2 4 5 7
            canceledOrders.add(order); // 2 4 5 7
        }

        int canceledOrder = 1;
        int count = 0;

        // canceledOrders 집합에 없는 번호 중 n 번째 번호를 찾음
        while (count < n) { // 3 < 3
            if (!canceledOrders.contains(canceledOrder)) { // set 에 찾는 값 있냐 7
                count++; //
            }
            canceledOrder++; //
        }
        answer = canceledOrder - 1;

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 4, 5, 7}, 3));
    }

}
