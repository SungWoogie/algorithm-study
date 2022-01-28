package codeup;

import java.util.Scanner;

public class C1170 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int schoolNumber = scanner.nextInt(); // 학번
        int classNumber = scanner.nextInt(); // 반
        int number = scanner.nextInt(); // 번호

        if (schoolNumber > 3 || classNumber > 6 || number > 30) {
            System.out.println(schoolNumber + "" + classNumber + "" + number);
        } else {
            System.out.printf("%d%d%02d", schoolNumber, classNumber, number);
        }
    }
}