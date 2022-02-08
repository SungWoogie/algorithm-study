package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 0; i < 3; i++) {
            list.add(a % 10);
            a /= 10;
        }
        int tmp = (list.get(0) * 100) + (list.get(1) * 10) + list.get(2);

        for (int i = 0; i < 3; i++) {
            list.add(b % 10);
            b /= 10;
        }
        int tmp1 = (list.get(0) * 100) + (list.get(1) * 10) + list.get(2);

        System.out.println(Math.max(tmp, tmp1));
    }
}
