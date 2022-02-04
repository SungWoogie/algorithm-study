package baekjoon;

import java.util.Scanner;

public class Q10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int max = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int num = scanner.nextInt();

            if (max > num) {
                System.out.print(num + " ");
            }
        }
    }
}
