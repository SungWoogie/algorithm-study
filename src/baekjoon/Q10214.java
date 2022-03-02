package baekjoon;

import java.util.Scanner;

public class Q10214 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int yTeam = 0;
            int kTeam = 0;

            for (int j = 0; j < 9; j++) {
                yTeam += scanner.nextInt();
                kTeam += scanner.nextInt();
            }
            if (yTeam > kTeam) {
                System.out.println("Yonsei");
            } else if (yTeam < kTeam) {
                System.out.println("Korea");
            } else {
                System.out.println("Draw");
            }
        }
    }
}