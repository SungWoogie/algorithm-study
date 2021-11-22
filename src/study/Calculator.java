package study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        List<String> strList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] value = str.split(" ");

//        for (int i = 0; i < str.length(); i++) {
//            value = Integer.parseInt()
//        }

        System.out.println(str.length());
    }
}
