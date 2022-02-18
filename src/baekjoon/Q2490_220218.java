package baekjoon;

import java.util.Scanner;

public class Q2490_220218 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0; // 0 은 배

        for (int i = 0; i < 3; i++) {
            int count = 0; // 0기준
            for (int j = 0; j < 4; j++) {
                int num = scanner.nextInt();

                if (num == a) {
                    count++;
                }
            }
            if (count == a) {
                System.out.println("E");
            } else if (count == 4) {
                System.out.println("D");
            } else if (count == 3) {
                System.out.println("C");
            } else if (count == 2) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
        }
    }
}
