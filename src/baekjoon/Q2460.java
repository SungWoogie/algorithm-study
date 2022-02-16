package baekjoon;

import java.util.Scanner;

public class Q2460 { // 지능형 기차2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int person = 0;
        int max = 0;

        for (int i = 0; i < 10; i++) {
            int out = scanner.nextInt();
            int in = scanner.nextInt();

            person = person - out + in;
            max = Math.max(person, max);
        }
        System.out.println(max);
    }
}
