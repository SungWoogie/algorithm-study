package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q5522 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int num = 0;
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
            num += list.get(i);
        }
        System.out.println(num);
    }
}
