package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q2576_220222 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int sum = 0; // 홀수인 값을 저장할 변수
        int count = 0; // 홀수가 없다면 count 횟수 저장할 변수
        for (int i = 0; i < 7; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 1) { // 홀수인지 비교하는 조건
                list.add(num); // 홀수면 num 값을 list 에 저장
                sum += num;
            } else {
                count++;
            }
        }
        Collections.sort(list); // 오름차순으로 정렬
        if (count == 7) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
}
