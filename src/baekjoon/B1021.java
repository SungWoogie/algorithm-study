package baekjoon;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// 회전하는 큐

public class B1021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= n; i++) { // 1부터 n 까지 숫자 담기
            deque.offer(i);
        }

        int count = 0; // 2번 3번의 연산 횟수를 더하는 변수
        for (int i = 0; i < m; i++) {
            int target = scanner.nextInt(); // 뽑을 숫자 입력
            int idx = 0; // 인덱스 저장할 변수

            for (int num : deque) { // deque 에 있는 숫자 하나씩 꺼내서 인덱스 변수에 저장하기
                if (num == target) {
                    break;
                }
                idx++;
            }
            int move = 0; // 움직이는 변수 찾기
            if (idx <= deque.size() / 2) { // 인덱스가 deque / 2 했을 때 더 짧은지 확인하고 2번 연산 수행하고
                move = idx;
                while (move-- > 0) {
                    deque.offerLast(deque.pollFirst()); // 첫번째에 있는값 빼서 맨 뒤에 추가하기
                    count++;
                }
            } else { // 3번 연산 수행
                move = deque.size() - idx;
                while (move-- > 0) {
                    deque.offerFirst(deque.pollLast());
                    count++;
                }
            }
            deque.pollFirst(); // 뽑기
        }

        System.out.println(count);
    }
}