package baekjoon;

import java.util.Scanner;

public class Q2530 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int second = scanner.nextInt();
        int timer = scanner.nextInt();

        while (true) {

            second += timer;
            minute += second / 60;
            second %= 60;
            hour += minute / 60;
            minute %= 60;
            hour %= 24;
            break;
        }
        System.out.println(hour + " " + minute + " " + second);
    }
}