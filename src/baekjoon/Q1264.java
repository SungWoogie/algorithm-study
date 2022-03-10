package baekjoon;

import java.util.Scanner;

public class Q1264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lowerArr = new String[]{"a", "e", "i", "o", "u"};
        String[] upperArr = new String[]{"A", "E", "I", "O", "U"};

        while (true) {
            int count = 0;
            String[] str = scanner.nextLine().split("");
            if ("#".equals(str[0])) {
                break;
            } else {
                for (int j = 0; j < lowerArr.length; j++) {
                    for (String s : str) {
                        if (s.equals(lowerArr[j])) {
                            count++;
                        }
                        if (s.equals(upperArr[j])) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
