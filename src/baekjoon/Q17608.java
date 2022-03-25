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
        int count = 1;
        if (t == 0) {
            count = 0;
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(list.size() - 1) < list.get(i)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
