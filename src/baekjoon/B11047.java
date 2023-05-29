package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 동전 O, S : 4
public class B11047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 동전 개수
        int k = scanner.nextInt(); // 가지고 있는 돈

        List<Integer> coins = new ArrayList<>();
        for (int i = 0; i < n; i++) { // 가지고 있는 동전 n 개 만큼 입력 (1원부터 오름차순으로)
            coins.add(scanner.nextInt());
        }

        int count = 0; // 동전 개수 저장할 변수
        for (int i = coins.size() - 1; i >= 0; i--) { // 큰 금액 부터 반대로 금액 빼서 카운트 하기
            if (k >= coins.get(i)) {
                int divide = k / coins.get(i);
                count += divide;
                k %= coins.get(i);
            }
        }
        System.out.println(count);
    }
}
