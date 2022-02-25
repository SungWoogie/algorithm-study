package baekjoon;

import java.util.Scanner;

public class Q10824 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strArr = new String[4];

        String str = "";
        String str1 = "";
        for (int i = 0; i < 4; i++) { // 입력 4개
            strArr[i] = scanner.next();
        }
        for (int i = 0; i < 4; i++) {
            if (i == 0 || i == 1) { // 0번째, 1번째 붙여
                str = strArr[0] + strArr[1];
            }
            if (i == 2 || i == 3) {
                str1 = strArr[2] + strArr[3];
            }
        }
        long aValue = Long.parseLong(str);
        long bValue = Long.parseLong(str1);
        System.out.println(aValue + bValue);
    }
}
