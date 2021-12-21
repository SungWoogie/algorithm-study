package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q11948 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        int aScore = list.get(1) + list.get(2) + list.get(3);

        int max = 0;
        for (int i = 0; i < 2; i++) {
            int bScore = scanner.nextInt();

            if (max < bScore) {
                max = bScore;
            }
        }
        System.out.println(aScore + max);
    }
}
