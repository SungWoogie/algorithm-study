package sungjun;

import java.util.Scanner;

public class SungJun1_211205 {
    public static void main(String[] args) {
        int t = 5;
        int num = 2 * 5 + 1;

        for (int i = 0; i < t; i++) {
            num++;
            int number = 0;
            for (int j = 0; j < t; j++) {
                num++;
                System.out.print(num + " ");
            }
            System.out.println();
            number++;
            System.out.print(number + " ");
        }
    }
}
