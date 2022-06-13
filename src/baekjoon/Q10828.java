package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Q10828 {
    public static void main(String[] args) {
        int h = 5;
        draw1(h);
        draw2(h);

    }

    public static void draw1(int h) {
        if (h == 0) {
            return;
        }
        draw1(h - 1);
        for (int i = 0; i < h; i++) {
            System.out.printf("*");
        }
        System.out.println();
    }

    public static void draw2(int h) {
        for (int o = 0; o < h; o++) {
            for (int i = 0; i < o; i++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

}
