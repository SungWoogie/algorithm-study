package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 2021.11.16
public class Q2752 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        for (int a : list) {
            System.out.print(a + " ");
        }
    }
}
