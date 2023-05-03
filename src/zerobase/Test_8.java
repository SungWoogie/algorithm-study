package zerobase;

import java.util.List;
import java.util.Scanner;

// 과세 금액 계산 프로그램

public class Test_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[과세 금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:");
        int income = scanner.nextInt();

        List<Integer> taxList = List.of(0, 12_000_000, 46_000_000, 88_000_000, 150_000_000, 300_000_000, 500_000_000, 1_000_000_000, Integer.MAX_VALUE);
        List<Double> taxRates = List.of(0.06, 0.15, 0.24, 0.35, 0.38, 0.4, 0.42, 0.45);

        int tax = 0;
        for (int i = 1; i < taxList.size(); i++) {
            int taxableIncome = Math.min(income - taxList.get(i - 1), taxList.get(i) - taxList.get(i - 1));
            if (taxableIncome > 0) { // 과세 소득이 0보다 큰 경우 현재 세금 슬래브에 대한 세액을 계산한다.
                int taxAmount = (int) (taxableIncome * taxRates.get(i - 1));
                System.out.printf("%10d * %2.0f%% = %10d\n", taxableIncome, taxRates.get(i - 1) * 100, taxAmount);
                tax += taxAmount;
            } else {  // 과세 소득이 0 이거나 음수이면 루프가 끊어집니다.
                break;
            }
        }
        System.out.printf("\n[세율에 의한 세금]:%22d\n", tax);
        System.out.printf("[누진공제 계산에 의한 세금]:%15d\n", tax);
    }

}
