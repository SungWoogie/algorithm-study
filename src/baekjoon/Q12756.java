package baekjoon;

import java.util.Scanner;

public class Q12756 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aUser = scanner.nextInt();
        int aStamina = scanner.nextInt();
        int bUser = scanner.nextInt();
        int bStamina = scanner.nextInt();

        while (true) {
            aStamina -= bUser;
            bStamina -= aUser;

            if (bStamina <= 0 && aStamina > 0) {
                System.out.println("PLAYER A");
                break;
            } else if (aStamina <= 0 && bStamina > 1) {
                System.out.println("PLAYER B");
                break;
            } else if (aStamina <= 0 && bStamina <= 0) {
                System.out.println("DRAW");
                break;
            }
        }
    }
}