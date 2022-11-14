package study;

import java.beans.IntrospectionException;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Lotto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num = Integer.parseInt(str);
        int money = num / 1_000;
        System.out.println(money);

        try {
            validateModifyInputMoneyType(str);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int validateModifyInputMoneyType(String inputMoney) {
        try {
            return Integer.parseInt(inputMoney);
        } catch (IllegalArgumentException exceptionMessage) {
            throw new IllegalArgumentException("[ERROR] 입력한 금액이 숫자가 아닙니다.");
        }
    }

    static final Set<Integer> set = new HashSet<>();
    static {
        for (int i = 0; i <= 6; i++) {
            set.add(i);
        }
    }

}
