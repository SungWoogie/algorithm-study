package baekjoon;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Q10757 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine()," ");

        BigInteger A = new BigInteger(str.nextToken());
        BigInteger B = new BigInteger(str.nextToken());

        A = A.add(B);
        System.out.println(A);
    }
}
