package zerobase;

import java.util.Scanner;

// 결제 금액 캐시백 계산 프로그램
public class Test_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요. (금액):");
        long amount = scanner.nextLong();

        if (amount >= 1000) {
            if (amount / 10 >= 300) {
                System.out.println("결제 금액은 " + amount + "원이고, 캐시백은 300원 입니다.");
            } else if (amount / 10 > 100 && amount / 10 >= 200) {
                System.out.println("결제 금액은 " + amount + "원이고, 캐시백은 200원 입니다.");
            } else {
                System.out.println("결제 금액은 " + amount + "원이고, 캐시백은 100원 입니다.");
            }
        } else {
            System.out.println("결제 금액은 " + amount + "원이고, 캐시백은 0원 입니다.");
        }
    }
}
