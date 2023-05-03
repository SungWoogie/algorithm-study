package zerobase;

import java.util.Scanner;

// 과세 금액 계산 프로그램

public class Test_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[과세 금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:");
        int income = scanner.nextInt();

        int[] taxSlabs = {0, 12_000_000, 46_000_000, 88_000_000, 150_000_000, 300_000_000, 500_000_000, 1_000_000_000, Integer.MAX_VALUE};
        double[] taxRates = {0.06, 0.15, 0.24, 0.35, 0.38, 0.4, 0.42, 0.45};
//        int[] taxDeductions = {0, 0, 1_080_000, 5_220_000, 14_900_000, 19_400_000, 25_400_000, 35_400_000, 65_400_000};

        int tax = 0;
        for (int i = 1; i < taxSlabs.length; i++) {
            int taxableIncome = Math.min(income - taxSlabs[i - 1], taxSlabs[i] - taxSlabs[i - 1]);
            if (taxableIncome > 0) {
                int taxAmount = (int) (taxableIncome * taxRates[i - 1]);
                System.out.printf("%10d * %2.0f%% = %10d\n", taxableIncome, taxRates[i - 1] * 100, taxAmount);
                tax += taxAmount;
            } else {
                break;
            }
        }

        System.out.printf("\n[세율에 의한 세금]:%22d\n", tax);
        System.out.printf("[누진공제 계산에 의한 세금]:%15d\n", tax);
    }

}
