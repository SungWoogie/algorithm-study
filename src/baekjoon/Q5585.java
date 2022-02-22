package baekjoon;

import java.util.Scanner;

public class Q5585 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tmp = 1000;
        int n = scanner.nextInt();
        int money = tmp - n; // 380

        int count = 0;
        while (money > 0) {
            if (money >= 500) {
                money -= 500;
                count++;
            } else if (money >= 100) {
                money -= 100;
                count++;
            } else if (money >= 50) {
                money -= 50;
                count++;
            } else if (money >= 10) {
                money -= 10;
                count++;
            } else if (money >= 5) {
                money -= 5;
                count++;
            } else {
                money -= 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
