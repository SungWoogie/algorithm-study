package study;

import java.util.*;

public class Overlap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> symbol2 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            symbol2.add(scanner.next());
        }
        System.out.println(symbol2);

        String str = "2 + 3 * 4 / 2";
        String[] strings = str.split(" ");
        System.out.println(Arrays.toString(strings));

        List<String> symbolList = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].contains("+")) {
                symbolList.add("+");
                strings[i] = "";
            } else if (strings[i].contains("-")) {
                symbolList.add("-");
                strings[i] = "";
            } else if (strings[i].contains("*")) {
                symbolList.add("*");
                strings[i] = "";
            } else if (strings[i].contains("/")) {
                symbolList.add("/");
                strings[i] = "";
            }
        }
        System.out.println(symbolList);

        List<String> numberList = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].equals("")) {
                numberList.add(strings[i]);
            }
        }
        System.out.println(numberList);
    }
}
