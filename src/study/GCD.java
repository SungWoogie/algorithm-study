package study;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); // 24
        int y = scanner.nextInt(); // 18

        System.out.println(gcd(x, y));
        System.out.println(lcm(x,y));

    }

    // 최대공약수 구하기 gcd
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    // 최대공배수 구하기 lcm
    public static int lcm(int x, int y) {
        return (x * y) / gcd(x, y);

    }
}
