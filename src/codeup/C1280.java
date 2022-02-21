package codeup;

import java.util.Scanner;

public class C1280 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char plus = '+';
        char minus = '-';
        char text = '=';

        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                sum += i;
                sb.append(plus).append(i);
            } else {
                sum -= i;
                sb.append(minus).append(i);
            }
            if (i == b){
                sb.append(text).append(sum);
            }
        }
        System.out.println(sb);
    }
}

