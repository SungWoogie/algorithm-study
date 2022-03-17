package baekjoon;

import java.util.Scanner;

public class Q10820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            int lower = 0; // 소문자
            int upper = 0; // 대문자
            int number = 0; // 숫자
            int space = 0; // 공백

            for (int i = 0; i < str.length(); i++) {
                char[] chArr = str.toCharArray();

                if (chArr[i] >= 97 && chArr[i] <= 122) {
                    lower++;
                } else if (chArr[i] >= 65 && chArr[i] <= 90) {
                    upper++;
                } else if (chArr[i] >= 48 && chArr[i] <= 57) {
                    number++;
                } else {
                    space++;
                }
            }
            System.out.println(lower + " " + upper + " " + number + " " + space);
        }
    }
}
