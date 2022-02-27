package baekjoon;

import java.util.Scanner;

public class Q10824 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strArr = new String[4];

        String word = "";
        String word1 = "";
        for (int i = 0; i < 4; i++) { // 입력 4개
            strArr[i] = scanner.next();
        }
        for (int i = 0; i < 4; i++) {
            if (i == 0 || i == 1) { // 0번째, 1번째 붙여
                word = strArr[0] + strArr[1];
            }
            if (i == 2 || i == 3) {
                word1 = strArr[2] + strArr[3];
            }
        }
        long aValue = Long.parseLong(word);
        long bValue = Long.parseLong(word1);
        System.out.println(aValue + bValue);
    }
}
