package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q11728 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[scanner.nextInt()];
        int[] arr1 = new int[scanner.nextInt()];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(scanner.nextInt());
        }
        for (int i = 0; i < arr1.length; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);

        for (int a : list) {
            System.out.print(a + " ");
        }
    }
}
