package baekjoon;

import java.io.*;

public class Q14928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        long value = 0;
        for (int i = 0; i < n.length(); i++) {
            value = (value * 10 + (n.charAt(i) - '0')) % 20000303;
        }
        bw.write(value + "\n");

        bw.flush(); // 남아있는 데이터를 모두 출력시킴
        br.close(); // 스트림을 닫음
        bw.close();

    }
}
