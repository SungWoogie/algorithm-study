package test;

import java.util.*;

public class 성준 {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    private static Map<String, Integer> map = new HashMap<>();

    static {
        System.out.println("asdsad");
        System.out.println(map.getOrDefault("aboveCount", 123));
        map.getOrDefault("failCount", 0);
        map.getOrDefault("underCount", 0);
    }


    public static void main(String[] args) {



        map.put("1234", 1);
        map.put("1235", 1);
        System.out.println(map.get("aboveCount"));


    }



















}
