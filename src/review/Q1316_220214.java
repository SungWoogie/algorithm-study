package review;

import java.util.Scanner;

public class Q1316_220214 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String str = scanner.next();
            boolean[] arr = new boolean[26];
            boolean check = true;

            for (int j = 0; j < str.length(); j++) {
                int ch = str.charAt(j) - 97;
                if (arr[ch]) {
                    if (str.charAt(j) != str.charAt(j - 1)) {
                        check = false;
                        break;
                    }
                } else {
                    arr[ch] = true;
                }
            }
            if (check) {
                count++;
            }
        }
        System.out.println(count);
    }
}
