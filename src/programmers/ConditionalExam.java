package programmers;

import java.util.Scanner;

public class ConditionalExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();
        if (value % 3 == 0) {
            System.out.println("value 는 3의 배수입니다.");
        } else {
            System.out.println("3의 배수가 아닙니다.");
        }
    }
}

