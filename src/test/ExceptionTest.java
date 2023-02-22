package test;

import java.util.Scanner;

public class ExceptionTest {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String name = SCANNER.nextLine();
        try {
            validateCarNameLength(name);
            validateCarNameBlank(name);
            validateCarNameEmpty(name);
        } catch (IllegalArgumentException msg) {
            System.out.println(msg.getMessage());
        } catch (Exception msg) {
            System.out.println("알수 없는 예외");
        }
    }

    public static void validateCarNameLength(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException("자동차 이름의 길이가 5보다 큽니다.");
        }
    }

    public static void validateCarNameBlank(String carName) {
        if (carName.contains(" ")) {
            throw new IllegalArgumentException("자동차 이름에 공백이 포함되어 있습니다.");
        }
    }
    public static void validateCarNameEmpty(String carName) {
        if (carName.equals("")) {
            throw new IllegalArgumentException("자동차 이름을 입력하지 않았습니다.");
        }
    }
}
