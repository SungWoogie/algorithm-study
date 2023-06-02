package zerobase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 자판기가 반환하는 금액을 순서대로 담은 정수 배열을 반환
public class PreCodingTest_3_5_5 {
    public static int[] solution(int[] arr) {
        List<Integer> coins = List.of(10, 50, 100, 500);
        List<Integer> bills = List.of(1000, 5000, 10000);

        List<Integer> change = new ArrayList<>();
        int[] answer;

        int remainingAmount = Arrays.stream(arr).sum();

        boolean billReturned = false;
        for (int i = 1; i < arr.length; i++) {
            if (bills.contains(arr[i])) {
                if (!billReturned) {
                    remainingAmount -= arr[i];
                    change.add(arr[i]);
                    billReturned = true;
                }
            } else {
                break;
            }
        }

        for (int i = coins.size() - 1; i >= 0; i--) {
            int coin = coins.get(i);
            while (remainingAmount >= coin) {
                remainingAmount -= coin;
                change.add(coin);
            }
        }

        answer = new int[change.size()];
        for (int i = 0; i < change.size(); i++) {
            answer[i] = change.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1000, 1000, 100}))); // {1000,500,500,100}
    }
}

