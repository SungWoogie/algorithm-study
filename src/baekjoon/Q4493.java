package baekjoon;

import java.util.Scanner;

public class Q4493 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int p1count = 0;

            for (int j = 0; j < n; j++) {
                String p1 = scanner.next();
                String p2 = scanner.next();
                if (!p1.equals(p2)) {
                    switch (p1) {
                        case "R":
                            switch (p2) {
                                case "P":
                                    p1count--;
                                    break;
                                case "S":
                                    p1count++;
                                    break;
                            }
                            break;
                        case "P":
                            switch (p2) {
                                case "R":
                                    p1count++;
                                    break;
                                case "S":
                                    p1count--;
                                    break;
                            }
                            break;
                        case "S":
                            switch (p2) {
                                case "R":
                                    p1count--;
                                    break;
                                case "P":
                                    p1count++;
                                    break;
                            }
                            break;
                    }
                }
            }
            if (p1count > 0) {
                System.out.println("Player 1");
            } else if (p1count < 0) {
                System.out.println("Player 2");
            } else {
                System.out.println("TIE");
            }
        }
    }
}
