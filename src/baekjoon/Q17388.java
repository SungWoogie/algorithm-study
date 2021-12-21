package baekjoon;

import java.util.Scanner;

public class Q17388 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // 숭실
        int b = scanner.nextInt(); // 고려
        int c = scanner.nextInt(); // 한양

        int total = a + b + c;

        if (total >= 100) {
            System.out.println("OK");
        } else if (a < b && a < c) {
            System.out.println("Soongsil");
        } else if (b < a && b < c) {
            System.out.println("Korea");
        } else {
            System.out.println("Hanyang");
        }
    }
}
