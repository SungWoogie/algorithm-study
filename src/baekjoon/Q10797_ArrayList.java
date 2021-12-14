package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10797_ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int num = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
            if (list.get(i) == num) {
                count++;
            }
        }
        System.out.println(count);
    }
}
