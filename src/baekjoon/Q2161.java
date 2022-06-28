package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2161 { // 카드 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>(); // Queue 유형 문제

        int testCase = scanner.nextInt();

        for (int i = 1; i <= testCase; i++) {
            queue.offer(i); // 주어진 testCase 까지 숫자를 Queue 에 저장
        }
        StringBuilder sb = new StringBuilder(); // 버린 카드를 담기 위한 StringBuilder 활용
        while (queue.size() > 1) { // Queue 에 카드가 한장이 될 때까지 반복
            sb.append(queue.poll()).append(" "); // 버린 카드는 StringBuilder 에 저장
            queue.offer(queue.poll()); // 첫번째 값을 Queue 맨뒤에 저장
        }
        System.out.println(sb.append(queue.poll())); // 버린 카드 출력 과 Queue 에 남은 카드 붙여서 출력
    }
}

