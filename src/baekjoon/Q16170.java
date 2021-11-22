package baekjoon;

import java.time.LocalDate;

public class Q16170 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int month = now.getMonth().getValue();
        int day = now.getDayOfMonth();

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
}
