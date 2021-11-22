package baekjoon;

import java.text.SimpleDateFormat;
import java.util.Date;

// 2021.11.16
public class Q10699 {
    public static void main(String[] args) {
        String str = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);

        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
    }
}
