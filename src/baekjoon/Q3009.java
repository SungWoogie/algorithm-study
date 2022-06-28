package baekjoon;

import java.util.Scanner;

public class Q3009 { // 네 번째 점
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] xArr = new int[3];
        int[] yArr = new int[3];

        for (int i = 0; i < xArr.length; i++) {
            xArr[i] = scanner.nextInt();
            yArr[i] = scanner.nextInt();
        }

        int x = 0;
        int y = 0;
        for (int i = 0; i < xArr.length; i++) { // x 값 찾기
            if (xArr[0] == xArr[1]) {
                x = xArr[2];
            } else if (xArr[0] == xArr[2]) {
                x = xArr[1];
            } else {
                x = xArr[0];
            }
        }
        for (int i = 0; i < yArr.length; i++) { // y 값 찾기
            if (yArr[0] == yArr[1]) {
                y = yArr[2];
            } else if (yArr[0] == yArr[2]) {
                y = yArr[1];
            } else {
                y = yArr[0];
            }
        }
        System.out.println(x + " " + y);
    }

}
