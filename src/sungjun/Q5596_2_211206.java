package sungjun;

import java.util.Scanner;

public class Q5596_2_211206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s = 0;
        int t = 0;

        for (int i = 0; i < 4; i++) {
            int minGuk = scanner.nextInt();
            int manse = scanner.nextInt();
            s += minGuk;
            t += manse;
        }
        if (s >= t) {
            System.out.println(s);
        } else {
            System.out.println(t);
        }
    }
}
