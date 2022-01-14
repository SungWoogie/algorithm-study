package codeup;

import java.util.Scanner;

public class C1031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        String change = Integer.toOctalString(num); // 8 진수로 변환해주는 메소드
        System.out.println(change);
    }
}
