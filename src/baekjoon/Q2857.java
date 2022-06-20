package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2857 { // FBI
    public static void main(String[] args) throws IOException { // 시간제한있어어 Scanner 보다 빠른 버퍼 리더 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = new String[5]; // 5번 반복해야 할 배열 생성
        int count = 0;

        for (int i = 0; i < strings.length; i++) { // 각 인덱스에 이름 저장
            strings[i] = br.readLine();
        }
        for (int i = 0; i < strings.length; i++) { // contains 메소드 사용하여 이름에 FBI 가 있는지 확인
            if (strings[i].contains("FBI")) {
                System.out.print((i + 1) + " "); // 1 더해서 출력
                count++;
            }
        }
        if (count == 0) {
            System.out.println("HE GOT AWAY!");
        }

    }
}
