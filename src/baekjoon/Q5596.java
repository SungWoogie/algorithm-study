package baekjoon;

import java.util.Scanner;

public class Q5596 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s = 0; // 민국이 총점
        int t = 0; // 만세 총점

        while (true) {
            int minGuk = scanner.nextInt();
            int manse = scanner.nextInt();

            s += minGuk;
            t += manse;

            if (s >= t) {
                System.out.println(s);
            } else {
                System.out.println(t);
                break;
            }
        }
    }
}
