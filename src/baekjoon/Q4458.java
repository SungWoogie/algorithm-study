package baekjoon;

import java.io.*;

public class Q4458 { // 첫 글자를 대문자로 Bronze 2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String str = br.readLine();

            if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
                System.out.print((char) (str.charAt(0) - 32));
            } else {
                System.out.print(str.charAt(0));
            }
            System.out.println(str.substring(1));
        }
    }
}
