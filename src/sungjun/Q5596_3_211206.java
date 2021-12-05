package sungjun;

import java.util.Scanner;

public class Q5596_3_211206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s = 0;
        int t = 0;

        for (int i = 0; i < 4; i++) {
            int minGuk = scanner.nextInt();
            t += minGuk;
        }
        for (int i = 0; i < 4; i++) {
            int manse = scanner.nextInt();
            s += manse;
        }
        if (s >= t) {
            System.out.println(s);
        } else {
            System.out.println(t);
        }
    }
}
