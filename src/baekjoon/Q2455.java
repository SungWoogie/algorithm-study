package baekjoon;

import java.util.Scanner;

public class Q2455 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int person = 0; // 32

        for (int i = 0; i < 4; i++) {
            int out = scanner.nextInt(); // 내린 사람
            int in = scanner.nextInt(); // 탄사람

            person = person - out + in;
            max = Math.max(max, person);
        }
        System.out.println(max);
    }
}
