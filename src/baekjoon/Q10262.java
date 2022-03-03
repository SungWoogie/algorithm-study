package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q10262 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strA = scanner.nextLine().split(" ");
        String[] strB = scanner.nextLine().split(" ");

        int sumA = 0; // 꿍
        int sumB = 0; // 석

        for (int i = 0; i < strA.length; i++) {
            int numA = Integer.parseInt(strA[i]);
            int numB = Integer.parseInt(strB[i]);

            sumA += numA;
            sumB += numB;
        }
        if (sumA > sumB) {
            System.out.println("Gunnar");
        } else if (sumA < sumB) {
            System.out.println("Emma");
        } else {
            System.out.println("Tie");
        }
    }
}

