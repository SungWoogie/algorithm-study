package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q17608 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            list.add(scanner.nextInt());
        }
        int count = 0;
        int max = Integer.MIN_VALUE;

        for (int i = list.size() - 1; i >= 0; i--) {
            if (max < list.get(i)) {
                max = list.get(i);
                count++;
            }
        }

        System.out.println(count);
    }
}
