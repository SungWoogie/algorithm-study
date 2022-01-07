package codeup;

import java.util.Scanner;

public class C1272 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt(); // 존의 번호
        int h = scanner.nextInt(); // 밥의 번호

        if (k % 2 == 0) {
            k = (k / 2) * 10;
        } else {
            k = (k + 1) / 2;
        }
        if (h % 2 == 0) {
            h = (h / 2) * 10;
        } else {
            h = (h + 1) / 2;
        }
        System.out.println(k + h);
    }
}
