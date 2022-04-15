package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }

        int count = 1;
        while (queue.size() != 1) {
            int q = queue.remove();
            if (count % 2 == 0) {
                queue.offer(q);
            }
            count++;
        }
        System.out.println(queue.peek());
    }
}
