package baekjoon;

import java.util.Scanner;

public class Q2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int minus;

        if (hour == 0 && minute < 45) { // 30 < 45
            hour = 23;
            minus = (60 - 45) + minute;
            System.out.println(hour + " " + minus);
        } else if (minute < 45) {
            hour--;
            minus = (60 - 45) + minute;
            System.out.println(hour + " " + minus);
        } else {
            minus = minute - 45;
            System.out.println(hour + " " + minus);
        }
    }
}
