package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q3003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 2, 8));
        List<Integer> list1 = new ArrayList<>();


        for (int i = 0; i < 6; i++) {
            list1.add(scanner.nextInt());

            int num = list.get(i) - list1.get(i);

            System.out.print(num + " ");
        }
    }
}


