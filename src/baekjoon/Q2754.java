package baekjoon;

import java.util.Scanner;

public class Q2754 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strArr = new String[]{"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"};
        double[] arr = new double[]{4.3, 4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0};

        String str = scanner.next();
        double value = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(str)) {
                value = arr[i];
            }
        }
        System.out.println(value);
    }
}
