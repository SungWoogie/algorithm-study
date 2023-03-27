package baekjoon;

import java.util.*;

public class Q10814 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int memberCount = scanner.nextInt();

        String[][] strArr = new String[memberCount][2];
        for (int i = 0; i < memberCount; i++) {
            strArr[i][0] = scanner.next(); // 나이
            strArr[i][1] = scanner.next(); // 이름
        }
        Arrays.sort(strArr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0; i < memberCount; i++) {
            System.out.println(strArr[i][0] + " " + strArr[i][1]);
        }

    }
}
