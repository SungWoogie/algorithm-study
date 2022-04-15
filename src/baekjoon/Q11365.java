package baekjoon;

import java.util.Scanner;

public class Q11365 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNextLine()) {
            String finish = scanner.nextLine();
            if (!finish.equals("END")) {
                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < finish.length(); i++) {
                    sb.append(finish.charAt(finish.length() - 1 - i));
                }
                System.out.println(sb);
            } else {
                break;
            }
        }
    }
}
