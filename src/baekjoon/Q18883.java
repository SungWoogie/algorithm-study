package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q18883 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[2];

        for (int i = 0; i < 2; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        for (int i = 0; i < arr[0]; i++) {
            for (int j = 0; j < arr[1]; j++) {
                count++;
                if (j != arr[1] - 1) {
                    bw.write(count + " ");
                } else {
                    bw.write(String.valueOf(count));
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
