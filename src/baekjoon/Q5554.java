package baekjoon;
//2021.11.16
import java.util.Scanner;

public class Q5554 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int total = a + b + c + d;
        int divide = total / 60;
        int multiply = divide * 60;
        int minus = total - multiply;

        System.out.println(divide);
        System.out.println(minus);
    }
}