package baekjoon;

import java.util.*;

// 23.01.04 요세푸스 문제 0
public class Q11866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 7
        int k = scanner.nextInt(); // 3

        Queue<Integer> queue = new LinkedList<>(); // 큐 컬렉션 활용
        for (int i = 1; i <= n; i++) {
            queue.add(i); // 1 부터 7 까지의 값을 큐에 저장한다.
        }
        StringBuilder stringBuilder = new StringBuilder("<"); // 값 출력을 위한 빌더 생성
        while (queue.size() > 1) { // 큐 사이즈가 1보다 클 때까지 반복한다.
            for (int i = 0; i < k - 1; i++) { // (k-1) = 2 (3 보다 작을 때까지 첫번째 값을 맨뒤에 추가한다.)
                queue.add(queue.poll());
            }
            stringBuilder.append(queue.poll()).append(", "); // 맨앞에 이란 값을 꺼내 빌더에 저장한다.
        }
        stringBuilder.append(queue.poll()).append(">"); // while 문이 종료되고 큐에 남아있는 마지막 값을 꺼내 빌더에 저장한다.
        System.out.println(stringBuilder);
    }
}
