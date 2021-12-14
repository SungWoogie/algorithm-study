package baekjoon;

import java.util.Scanner;

public class Q10039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        for (int i = 0; i < 5; i++) {
            int user = scanner.nextInt();

            if (user < 40) {
                user = 40;
                total += user;
            } else {
                total += user;
            }
        }
        System.out.println(total / 5);
    }
}