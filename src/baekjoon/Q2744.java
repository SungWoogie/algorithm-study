package baekjoon;

import java.util.Scanner;

public class Q2744 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] upperCase = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] lowerCase = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        StringBuilder sb = new StringBuilder();
        String str = scanner.next();

        String value;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < upperCase.length; j++) {
                if (str.charAt(i) == upperCase[j]) {
                    value = String.valueOf(str.charAt(i)); // 대문자에서 소문자
                    sb.append(value.toLowerCase());
                }
                if (str.charAt(i) == lowerCase[j]) {
                    value = String.valueOf(str.charAt(i)); // 소문자
                    sb.append(value.toUpperCase());
                }
            }
        }
        System.out.println(sb);
    }
}
