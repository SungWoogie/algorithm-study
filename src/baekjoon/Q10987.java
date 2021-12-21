package baekjoon;

import java.util.Scanner;

public class Q10987 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] word = new int[]{'a', 'e', 'i', 'o', 'u'};
        String str = scanner.next();
        int count = 0;

        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (word[i] == str.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
