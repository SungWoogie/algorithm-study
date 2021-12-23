package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < i; j++) {
                list.add(i);
            }
        }
        for (int i = a - 1; i <= b - 1; i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}
