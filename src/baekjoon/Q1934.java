package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q1934 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            for (int j = 1; j <= 45000; j++) {
                listA.add(a * j);
                listB.add(b * j);
                if (listA.contains(listB)) {
                    if (){
                    }
                }

            }
            Collections.sort(listA);
            Collections.sort(listB);
            System.out.println(list.get(0));
        }
    }
}
