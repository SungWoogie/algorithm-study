package baekjoon;
//2021.11.16
import java.util.Scanner;

public class Q5554_review {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int total = a + b + c + d;
        int minute = total / 60;
        int seconds = total % 60;

        System.out.println(minute);
        System.out.println(seconds);
    }
}