package sungjun;

import java.util.Scanner;

public class Q5543_1_211206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int burgerMin = 0;
        int drinkMin = 0;

        for (int i = 0; i < 3; i++) {
            int burger = scanner.nextInt();
            if (burgerMin >= burger) {
                burgerMin = burger;
            }
        }
        for (int i = 0; i < 2; i++) {
            int drink = scanner.nextInt();
            if (drinkMin >= drink) {
                drinkMin = drink;
            }
        }
        System.out.println(burgerMin + drinkMin - 50);
    }
}
