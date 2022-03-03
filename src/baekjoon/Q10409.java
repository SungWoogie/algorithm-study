package baekjoon;

import java.util.Scanner;

public class Q10409 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int total = scanner.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum += num;

            if (sum > total) {
                break;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}
