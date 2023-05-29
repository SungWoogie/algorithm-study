package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// S.4, 수들의 합 2
public class B2003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int count = 0;
        int start = 0;
        int end = 0;
        int sum = 0;

        while (true) {
            if (sum >= m) {
                sum -= list.get(start++);
            } else if (end == n) {
                break;
            } else {
                sum += list.get(end++);
            }

            if (sum == m) {
                count++;
            }
        }
        System.out.println(count);
    }
}
