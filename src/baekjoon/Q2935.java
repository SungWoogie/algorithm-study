package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Q2935 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger a = scanner.nextBigInteger();
        String symbol = scanner.next();
        BigInteger b = scanner.nextBigInteger();

        if (symbol.equals("*")) {
            System.out.println(a.multiply(b));
        } else {
            System.out.println(a.add(b));
        }
    }
}
