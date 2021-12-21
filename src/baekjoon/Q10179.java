package baekjoon;

import java.util.Scanner;

public class Q10179 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        double result = 0; // 80.00
        for (int i = 0; i < t; i++) {
            double value = scanner.nextDouble();
            result = value - (value * 0.2);

            System.out.println("$" + String.format("%.2f", result));
        }
    }
}
