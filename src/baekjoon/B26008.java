package baekjoon;

import java.util.Scanner;

// 해시함수 G4
public class B26008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long result = 1;

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int h = scanner.nextInt();

        for (int i = 0; i < n - 1; i++) {
            result = (result * m) % 1000000007;
        }
        System.out.println(result);
    }
}
