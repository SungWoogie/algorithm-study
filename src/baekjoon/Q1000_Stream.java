package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1000_Stream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        list.add(scanner.nextInt());
        list.add(scanner.nextInt());

        int sum = list.stream().mapToInt(n -> n).sum();
        System.out.println(sum);
    }
}
