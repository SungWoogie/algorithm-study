package baekjoon;

import java.util.Scanner;

public class Q2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int timer = scanner.nextInt();

        int minuteTime = minute + timer;

        while (minuteTime > 59) {
            hour++;
            minuteTime -= 60;
        }
        while (hour > 23) {
            hour -= 24;
        }
        System.out.println(String.format("%d %d", hour, minuteTime));
    }
}