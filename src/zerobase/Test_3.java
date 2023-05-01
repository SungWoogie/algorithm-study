package zerobase;

import java.util.Scanner;

// “놀이동산 입장권 계산 프로그램”

public class Test_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[입장권 계산]");
        long ticket = 10_000;
        long specialTicket = 4_000;
        long standardTicket = 8_000;

        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = scanner.nextInt();

        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int admissionTime = scanner.nextInt();

        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        String meritMan = scanner.next();

        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        String welfareCard = scanner.next();

        /*
        1. 3세 미만이면 0원
        2나이가 13 미만이면 특별 할인 4000
        3.17시 이후에 오면 특별할인 4000
        4. 복지카드나 국가 유공자의 경우 일반금액 8000
        5. 해당 없으면 10000
         */

        if (age < 3) {
            System.out.println("입장료: " + 0);
        } else if (age < 13 || admissionTime >= 17) {
            System.out.println("입장료: " + specialTicket);
        } else if (welfareCard.equals("y") || meritMan.equals("y")) {
            System.out.println("입장료: " + standardTicket);
        } else {
            System.out.println("입장료: " + ticket);
        }
    }
}