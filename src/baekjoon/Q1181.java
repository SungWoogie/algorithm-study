package baekjoon;

import java.util.*;

public class Q1181 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < testCase; i++) {
            set.add(scanner.nextLine());
        }
        int size = set.size();
        String[] strings = new String[size];
        set.toArray(strings);

        Arrays.sort(strings, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return o1.length() - o2.length();
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s).append('\n');
        }
        System.out.println(sb);
    }
}
