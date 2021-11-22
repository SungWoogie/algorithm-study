package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Q1271 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger n = scanner.nextBigInteger(); // n
        BigInteger m = scanner.nextBigInteger(); // m

        BigInteger split = n.divide(m);
        BigInteger percent = n.remainder(m);


        System.out.println(split);
        System.out.println(percent);
    }
}
