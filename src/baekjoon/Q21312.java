package baekjoon;

import java.util.Scanner;

public class Q21312 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[3];
        boolean odd = false;
        int value = 1;
        int value2 = 1;

        for (int i = 0; i < 3; i++) { 
            arr[i] = scanner.nextInt(); // 배열에 값 3개 입력
            if (arr[i] % 2 == 1) { // 홀수면 값 곱하기
                value *= arr[i];
                odd = true; // 홀수 기준이므로 하나라도 나오면 홀수를 출력하기 위한 boolean 변수
            } else {
                value2 *= arr[i];
            }
        }
        if (odd) { // 홀수가 하나라도 나오면 (true) 이므로 그 값 출력 
            System.out.println(value);
        } else {
            System.out.println(value2);
        }
    }
}
