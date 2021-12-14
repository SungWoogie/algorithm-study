package review;

import java.util.Scanner;

public class Q2525_Review {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int num = scanner.nextInt();

        int time = minute + num;

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
