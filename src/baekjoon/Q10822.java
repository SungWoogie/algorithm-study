package baekjoon;

import java.util.Scanner;

public class Q10822 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = scanner.nextLine().split(",");

        int sum = 0;
        for (String s : str) {
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
