package baekjoon;

import java.util.Scanner;

public class Q15781 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 방탄 수
        int m = scanner.nextInt(); // 조끼 수

        int helmetMax = 0;
        for (int i = 0; i < n; i++) {
            int helmet = scanner.nextInt();
            if (helmet >= helmetMax) {
                helmetMax = helmet;
            }
        }
        int vestMax = 0;
        for (int i = 0; i < m; i++) {
            int vest = scanner.nextInt();
            if (vest >= vestMax) {
                vestMax = vest;
            }
        }
        System.out.println(helmetMax + vestMax);
    }
}
