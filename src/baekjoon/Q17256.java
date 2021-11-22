package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q17256 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < 2; i++) {
            list.add(scanner.nextInt()); // x
            list.add(scanner.nextInt()); // y
            list.add(scanner.nextInt()); // z
        }
        int bx = list.get(3) - list.get(2);
        int by = list.get(4) / list.get(1);
        int bz = list.get(5) - list.get(0);
        System.out.println(bx + " " + by + " " + bz);
    }
}
