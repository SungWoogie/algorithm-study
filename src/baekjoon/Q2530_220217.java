package baekjoon;

import java.util.Scanner;

public class Q2530_220217 { // 인공지능 시계
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int second = scanner.nextInt();
        int plusTime = scanner.nextInt();

        int time = second + plusTime;

        while (time > 59) {
            minute++;
            time -= 60;
        }
        while (minute > 59) {
            hour++;
            minute -= 60;
        }
        while (hour > 23) {
            hour -= 24;
        }
        System.out.println(hour + " " + minute + " " + time);
    }
}
