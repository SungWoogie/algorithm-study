package baekjoon;

import java.util.*;

public class Q1977 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int m = scanner.nextInt(); // 60
        int n = scanner.nextInt(); // 100

        int sum = 0;
        for (int i = m; i <= n; i++) {
            for (int j = 1; j < n; j++) {
                if (j * j == i) {
                    sum += i;
                    list.add(i);
                }
            }
        }
        Collections.sort(list);
        if (list.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
}
