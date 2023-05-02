package zerobase;

import java.util.Random;
import java.util.Scanner;

// 주민등록 번호 생성 프로그램

public class Test_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        String year = scanner.next();

        System.out.print("출생월을 입력해 주세요.(mm):");
        String month = scanner.next();

        System.out.print("출생일을 입력해 주세요.(dd):");
        String day = scanner.next();

        System.out.print("성별을 입력해 주세요.(m/f):");
        String gender = scanner.next();

        if (gender.equals("m")) {
            gender = "3";
            System.out.printf("%s%s%s-%s", year.substring(2), month, day, gender);
        } else {
            gender = "4";
            System.out.printf("%s%s%s-%s", year.substring(2), month, day, gender);
        }

        StringBuffer tempNumber = new StringBuffer();
        for (int i = 0; i < 6; i++) {
            tempNumber.append(random.nextInt(10));
        }
        System.out.println(tempNumber);
    }
}