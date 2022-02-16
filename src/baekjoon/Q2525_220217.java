package baekjoon;

import java.util.Scanner;

public class Q2525_220217 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int plusTime = scanner.nextInt();

        int time = minute + plusTime; // 50

        while (time > 59) {
            hour++;
            time -= 60;
        }
        while (hour > 23) {
            hour -= 24;
        }
        System.out.println(hour + " " + time);
    }
}
