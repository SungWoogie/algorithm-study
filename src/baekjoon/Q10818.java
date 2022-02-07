package baekjoon;

import java.util.Scanner;

public class Q10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int num = scanner.nextInt();
        int min = num;
        int max = num;

        for (int i = 0; i < t - 1; i++) {
            int n = scanner.nextInt();

            if (max < n) {
                max = n;
            }
            if (min < n) {
                min = n;
            }
        }
        System.out.println(min + " " + max);
    }
}
