package baekjoon;

import java.util.Scanner;

public class Q23795 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int end = -1;
        int sum = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == end) {
                break;
            } else {
                sum += num;
            }
        }
        System.out.println(sum);
    }

}
