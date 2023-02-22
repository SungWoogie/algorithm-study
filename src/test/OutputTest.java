package test;

import java.util.*;

public class OutputTest {

    private static Random random = new Random();
    public static void main(String[] args) {
        Map<Integer, Boolean> map = new HashMap<>();
        map.put(1, false);
        map.put(5, true);
        map.put(3, false);
        map.forEach((k, v) -> System.out.println(k + " " + v));

        for (Map.Entry<Integer, Boolean> map2 : map.entrySet()) {
            System.out.println(map2.getKey() + " " + map2.getValue());

        }
    }
}
