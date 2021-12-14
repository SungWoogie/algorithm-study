package baekjoon;

import java.util.Scanner;

public class Q5596 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s = 0;
        for (int i = 0; i < 4; i++) {
            int minguk = scanner.nextInt();
            s += minguk;
        }
        int t = 0;
        for (int i = 0; i < 4; i++) {
            int manse = scanner.nextInt();
            t += manse;
        }
        if (s >= t) {
            System.out.println(s);
        } else {
            System.out.println(t);
        }
    }
}
