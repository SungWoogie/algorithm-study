package codeup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C1406 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        String word = scanner.next();
        list.add(word);
        String temp = "love";

        if (list.get(0).equals(temp)) {
            System.out.println("I love you.");
        } else if (!list.get(0).equals(temp)){
            System.out.println();
        }
    }
}
