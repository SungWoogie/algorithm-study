package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q2476 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = scanner.nextInt();

        int value = 0;

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a == b && b == c) {
                list.add(10000 + (a * 1000));
            } else if (a != b && b != c && a != c) {
                if (a > b && a > c) {
                    value = a * 100;
                } else if (b > a && b > c) {
                    value = b * 100;
                } else {
                    value = c * 100;
                }
                list.add(value);
            } else if (a == b || a == c) {
                list.add(1000 + (a * 100));
            } else {
                list.add(1000 + (b * 100));
            }
        }
        Collections.sort(list);
        System.out.println(list.get(n - 1));

    }
}
