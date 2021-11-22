package baekjoon;

import java.util.Scanner;

public class Q15439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int costume = n * n - n;
        System.out.println(costume);
    }
}
