package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine();

//        for (int i = 0; i < num.length(); i++) {
        numbers.add(Arrays.toString(num.split("")));
//        }

        for (String a : numbers) {
            System.out.print(a + " ");
        }

    }
}

class Split1 {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String[] number = scanner.nextLine().split("");

        for (int i = 0; i < number.length; i++) {
            numbers.add(number[i]);
        }

        for (String a : numbers) {
            System.out.println(a + " ");
        }
    }
}
