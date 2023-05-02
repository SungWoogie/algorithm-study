package zerobase;

import java.util.Calendar;
import java.util.Scanner;
// 달력 출력 프로그램
public class Test_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        int year = scanner.nextInt();

        System.out.print("달력의 월을 입력 주세요.(mm):");
        int month = scanner.nextInt();

        System.out.printf("\n[%d년 %02d월]\n", year, month);

        System.out.println("일\t월\t화\t수\t목\t금\t토");

        Calendar startDay = Calendar.getInstance();
        Calendar endDay = Calendar.getInstance();

        startDay.set(year, month - 1, 1);
        endDay.set(year, month, 1);
        endDay.add(Calendar.DATE, -1);

        int startDayOfWeek = startDay.get(Calendar.DAY_OF_WEEK);
        int endDayOfMonth = endDay.get(Calendar.DATE);

        for (int i = 1; i < startDayOfWeek; i++) {
            System.out.print("\t");
        }

        for (int i = 1, dayOfWeek = startDayOfWeek; i <= endDayOfMonth; i++, dayOfWeek++) {
            System.out.printf("%02d\t", i);
            if (dayOfWeek % 7 == 0) {
                System.out.println();
            }
        }
    }
}
