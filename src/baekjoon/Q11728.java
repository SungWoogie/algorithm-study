package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q11728 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> listA = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            listA.add(scanner.nextInt());
        }
        List<Integer> listB = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            listB.add(scanner.nextInt());
        }
        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            int a = listA.get(i);
            int b = listB.get(j);

            if (a <= b) {
                result.add(a);
                i++;
            } else {
                result.add(b);
                j++;
            }
        }
        for (; i < n; i++) {
            result.add(listA.get(i));
        }
        for (; j < m; j++) {
            result.add(listB.get(j));
        }
        StringBuilder sb = new StringBuilder();
        for (int d : result) {
            sb.append(d).append(" ");
        }
        System.out.println(sb);

    }
}
