package baekjoon;

import java.util.Scanner;

public class Q8545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
