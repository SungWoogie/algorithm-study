package baekjoon;

import java.util.*;

public class Q5597 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < 28; i++) {
            numList.add(scanner.nextInt());
        }
        for (int i = 0; i < 30; i++) {
            list.add(i + 1);
            if (!numList.contains(list.get(i))) {
                newList.add(i);
            }
        }
        Collections.sort(newList);
        int min = 1;
        int max = 1;

        min += newList.get(0);
        max += newList.get(newList.size() - 1);
        System.out.println(min);
        System.out.println(max);
    }
}
