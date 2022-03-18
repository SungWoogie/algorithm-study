package baekjoon;

import java.util.*;

public class Q2592 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[1001]; // 1000개 크기 만큼 배열 생성

        int sum = 0;
        for (int i = 0; i < 10; i++) { // 평균 값 더하기
            int num = scanner.nextInt();
            sum += num; // 입력 값 모두 더하기
            arr[num]++; // 입력한 값 위치에 ++
        }

        int index = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println((sum / 10) + "\n" + index);
    }
}
