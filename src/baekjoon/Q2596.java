package baekjoon;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q2596 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] strArr = new String[t];
        String str = scanner.next();
        int count1 = 0;
        int count2 = 6;

        for (int i = 0; i < t; i++) {
            strArr[i] = str.substring(count1, count2);
            count1 += 6;
            count2 += 6;
        }
        Map<String, String> map = new LinkedHashMap<>();
        map.put("A", "000000");
        map.put("B", "001111");
        map.put("C", "010011");
        map.put("D", "011100");
        map.put("E", "100110");
        map.put("F", "101001");
        map.put("G", "110101");
        map.put("H", "111010");
        StringBuilder sb = new StringBuilder();
        int 잘못됨 = 0;
        int 잘못된위치 = 0;
        for (int i = 0; i < t; i++) {
            int 못찾 = 0;
            for (String key : map.keySet()) {
                int index = 0;
                if (strArr[i].equals(map.get(key))) {
                    sb.append(key);
                    break;
                } else {
                    char[] chArr = strArr[i].toCharArray();
                    for (int j = 0; j < 6; j++) {
                        if (chArr[j] == map.get(key).charAt(j)) {
                            index++;
                        }
                    }
                }
                if (index == 5) {
                    sb.append(key);
                } else {
                    못찾++;
                }
            }
            if (못찾 == 8 && 잘못된위치 == 0) {
                잘못됨++;
                잘못된위치 = i + 1;
            }
        }
        if (잘못됨 > 0) {
            System.out.println(잘못된위치);
        } else {
            System.out.println(sb);
        }
    }
}
