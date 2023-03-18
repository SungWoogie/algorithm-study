package baekjoon;

import java.util.List;
import java.util.Scanner;

public class Q2789 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> textList = List.of('C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E');

        String input = scanner.next();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (!textList.contains(input.charAt(i))) {
                stringBuilder.append(input.charAt(i));
            }
        }
        System.out.println(stringBuilder);
    }
}
