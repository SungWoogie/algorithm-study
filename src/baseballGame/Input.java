package baseballGame;

import java.util.Scanner;

public class Input {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static String inputNumber() {
        System.out.println("숫자를 입력해주세요.");
        return SCANNER.next();
    }

}
