package baekjoon;

import java.util.Scanner;

public class Q2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int time = 45;
        int minus;

        if (hour == 0 && minute < time) { // 30 < 45
            hour = 23;
            minus = 60 - time + minute;
            System.out.println(hour + " " + minus);
        } else if (minute < time) {
            hour--;
            minus = 60 - time + minute;
            System.out.println(hour + " " + minus);
        } else {
            minus = minute - time;
            System.out.println(hour + " " + minus);
        }
    }
}
