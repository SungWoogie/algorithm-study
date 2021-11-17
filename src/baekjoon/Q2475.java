package baekjoon;
// 2021.11.17
import java.util.Scanner;

public class Q2475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int multiply = 0;
        int result = 0;

        for (int i = 0; i < 5; i++) {
            int n = scanner.nextInt();
            multiply = n * n;
            sum += multiply;
            result = sum % 10;
        }
        System.out.println(result);
    }
}
