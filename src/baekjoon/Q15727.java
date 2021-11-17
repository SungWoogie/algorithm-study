package baekjoon;

import java.util.Scanner;

public class Q15727 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = scanner.nextInt();

        if (l % 5 != 0) {
            System.out.println(l / 5 + 1);
        } else {
            System.out.println(l / 5);
        }
    }
}
