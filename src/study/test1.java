package study;

import java.util.*;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        int n = 0;

        while (n < 10) {
            set.add((int) (Math.random() * 10) + 1);
            n++;
        }

        List<Integer> list = new ArrayList<>(set);

        Iterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            int x = scanner.nextInt();
            if (list.contains(x)) {
                if (x < 5) {
                    System.out.println(list.get(i));
                }
            }
        }
    }
}


