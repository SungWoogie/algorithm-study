package codeup;

import java.util.Scanner;

public class C1035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next(); // f
        int num = Integer.parseInt(str, 16); // string 값을 16진수로 변환 한다.
        String value = Integer.toOctalString(num); // 다시 8진수로 변환

        System.out.println(value);
    }
}
