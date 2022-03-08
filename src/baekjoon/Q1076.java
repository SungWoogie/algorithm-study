package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        map.put("black", "0,1");
        map.put("brown", "1,10");
        map.put("red", "2,100");
        map.put("orange", "3,1000");
        map.put("yellow", "4,10000");
        map.put("green", "5,100000");
        map.put("blue", "6,1000000");
        map.put("violet", "7,10000000");
        map.put("grey", "8,100000000");
        map.put("white", "9,1000000000");

        String first = scanner.next();
        String second = scanner.next();
        String last = scanner.next();

        String resistance = map.get(first).split(",")[0] + map.get(second).split(",")[0];
        long value = Long.parseLong(resistance) * Long.parseLong(map.get(last).split(",")[1]);

        System.out.println(value);
    }
}
