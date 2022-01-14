package codeup;

import java.util.Scanner;

public class C1033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        String str = Integer.toHexString(num);// 10진수 -> 16진수로 변환 메소드
        System.out.println(str.toUpperCase()); // 소문자를 대문자로 바꿔주는 메소드
    }
}
