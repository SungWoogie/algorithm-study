package sungjun;

import java.util.Scanner;

public class Q10101_1_211207 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = a + b + c;

        if (a == b && a == c) {
            System.out.println("Equilateral");
        } else if (sum == 180 && a == b || b == c || a == c) {
            System.out.println("Isosceles");
        } else if (sum != 180) {
            System.out.println("Error");
        } else {
            System.out.println("Scalene");
        }
    }
}
