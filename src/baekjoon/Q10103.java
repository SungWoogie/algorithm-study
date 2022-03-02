package baekjoon;

import java.util.Scanner;

public class Q10103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int changYoung = 100;
        int sangGeun = 100;

        for (int i = 0; i < n; i++) {
            int chang = scanner.nextInt();
            int sang = scanner.nextInt();

            if (chang < sang) {
                changYoung -= sang;
            } else if (chang > sang) {
                sangGeun -= chang;
            }
        }
        System.out.println(changYoung);
        System.out.println(sangGeun);
    }
}
