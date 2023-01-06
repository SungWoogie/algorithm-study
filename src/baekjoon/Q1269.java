package baekjoon;

import java.io.*;
import java.nio.Buffer;
import java.util.*;

// 23.01.06
public class Q1269 {
    // 첫째줄 A 원소 개수, B의 원소 개수
    // 둘째줄 A의 모든 원소
    // 셋째줄 B의 모든 원소
    // 공통적인거 제외하고 A의 개수, B의 개수 합을 구하라
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            aSet.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            bSet.add(Integer.parseInt(st.nextToken()));
        }
        int sum = 0;
        for (int num : aSet) {
            if (!bSet.contains(num)) {
                sum += 1;
            }
        }
        for (int num : bSet) {
            if (!aSet.contains(num)) {
                sum += 1;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write((String.valueOf(sum)));
        bw.close();
    }
}
