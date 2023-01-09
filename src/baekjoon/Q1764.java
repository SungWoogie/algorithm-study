package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken()); // 3
        int m = Integer.parseInt(stringTokenizer.nextToken()); // 4

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(bufferedReader.readLine());
        }
        List<String> list2 = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < m; i++) {
            String str = bufferedReader.readLine();
            if (set.contains(str)) {
                list2.add(str);
                count++;
            }
        }
        Collections.sort(list2);
        System.out.println(count);
        for (String s : list2) {
            System.out.println(s);
        }
    }
}
