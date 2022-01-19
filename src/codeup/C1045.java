package codeup;

import java.util.Scanner;

public class C1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        float num = (float) a / (float) b; // float 변수타입에 저장하기 위하여 형변환

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.printf("%.2f", num);
    }
}
