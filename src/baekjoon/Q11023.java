package baekjoon;

import java.util.Scanner;

public class Q11023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = scanner.nextLine().split(" ");

        int sum = 0;
        for (String s : str) {
            int num = Integer.parseInt(s);
            sum += num;
        }
        System.out.println(sum);
    }
}
