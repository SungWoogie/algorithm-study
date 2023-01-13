package test;

import java.util.*;

public class VendingMachine {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        System.out.println("자판기가 보유하고 있는 금액을 입력해주세요.");
        int vendingMachineAmount = SCANNER.nextInt();

        Map<Integer, Integer> vendingMachineCoins = new HashMap<>() {
            {
                put(500, 0);
                put(100, 0);
                put(50, 0);
                put(10, 0);
            }
        };

        System.out.println("자판기가 보유한 동전");
        while (vendingMachineAmount > 0) {
            for (Map.Entry<Integer, Integer> total : vendingMachineCoins.entrySet()) {
                int random = RANDOM.nextInt(200) + 1;
                System.out.println(random + " 랜덤숫자");
                if (vendingMachineAmount >= total.getKey() * random) {
                    vendingMachineAmount -= total.getKey() * random;
                    vendingMachineCoins.put(total.getKey(), random + vendingMachineCoins.get(total.getKey()));
                }
            }
        }
        for (Map.Entry<Integer, Integer> total : vendingMachineCoins.entrySet()) {
            System.out.println(total);
        }

    }
}