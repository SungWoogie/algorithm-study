package study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        validateBlank(number);


        List<String> numbers = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            numbers.add(String.valueOf(number.charAt(i)));
        }
        validateLength(number);
        System.out.println(numbers);
    }


    private static boolean validateLength(String number) {
        if (number.length() < 3) {
            throw new IllegalArgumentException("입력해야 할 숫자 3개보다 작습니다.");
        }
        if (number.length() > 3) {
            throw new IllegalArgumentException("입력해야 할 숫자 3개보다 큽니다.");
        }
        return false;
    }

    private static void validateBlank(String inputNumber) {
        if (inputNumber.contains(" ")) {
            throw new IllegalArgumentException("공백이 포함되어있습니다.");
        }
    }

}
