package baekjoon;

import java.util.Scanner;

public class Q13985 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = scanner.nextLine().split(" ");

        int numA = Integer.parseInt(str[0]);
        int numB = Integer.parseInt(str[2]);
        int numC = Integer.parseInt(str[4]);

        if (numA + numB == numC) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
