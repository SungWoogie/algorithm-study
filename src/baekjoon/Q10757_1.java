package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

//22.03.01
public class Q10757_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        System.out.println(a.add(b));
    }
}
