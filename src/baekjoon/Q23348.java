package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q23348 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());

        int max = 0; // 42
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                st = new StringTokenizer(br.readLine());
                sum += Integer.parseInt(st.nextToken()) * a
                        + Integer.parseInt(st.nextToken()) * b
                        + Integer.parseInt(st.nextToken()) * c;
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
