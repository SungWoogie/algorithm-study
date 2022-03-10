package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1225 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        String[] str = a.split(" ");
        int[] arrA = new int[str[0].length()];
        int[] arrB = new int[str[1].length()];

        long sum = 0;
        for (int i = 0; i < str[0].length(); i++) {
            arrA[i] = str[0].charAt(i) - 48;
        }
        for (int i = 0; i < str[1].length(); i++) {
            arrB[i] = str[1].charAt(i) - 48;
        }
        for (int k : arrA) {
            for (int i : arrB) {
                sum += ((long) k * (long) i);
            }
        }
        System.out.println(sum);
    }
}
