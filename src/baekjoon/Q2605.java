package baekjoon;

import java.util.LinkedList;
import java.util.Scanner;

public class Q2605 { // 줄 세우기
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < testCase; i++) {
            int num = scanner.nextInt();
            list.add(num, i + 1);
        }
        for (int i = 0; i < testCase; i++) {
            System.out.print(list.pollLast() + " ");
        }
    }
}
