package codeup;

import java.util.Scanner;

public class C1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] time = scanner.next().split(":");
        System.out.println(time[0] + ":" + time[1]);
    }
}
