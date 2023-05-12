package baekjoon;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

// s4 요세푸스 순열
public class B11866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(i + 1);
        }

        StringBuffer stringBuffer = new StringBuffer("<");
        while (!queue.isEmpty()) {
            for (int i = 0; i < n; i++) {
                if (i != k - 1) {
                    queue.offer(queue.poll());
                } else {
                    stringBuffer.append(queue.poll()).append(", ");
                    break;
                }
            }
        }
        stringBuffer.delete(stringBuffer.length() - 2, stringBuffer.length());
        stringBuffer.append(">");
        System.out.println(stringBuffer);
    }
}
