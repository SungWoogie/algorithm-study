package sungjun;

import java.util.Scanner;

public class Q5543_2_211206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int burgerMin = scanner.nextInt();

        for (int i = 0; i < 2; i++) {
            int burger = scanner.nextInt();
            if (burgerMin >= burger) {
                burgerMin = burger;
            }
        }
        int drinkMin = scanner.nextInt();
        for (int i = 0; i < 1; i++) {
            int drink = scanner.nextInt();
            if (drinkMin >= drink) {
                drinkMin = drink;
            }
        }
        System.out.println(burgerMin + drinkMin - 50);
    }
}
