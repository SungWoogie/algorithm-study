package baekjoon;

import java.util.Scanner;

public class Q2231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) { // n 만큼 도는 포문
            int sum = i; // 198
            int k = i; // 198

            while (0 < k) { // k를 쪼개기 위한 반복문
                sum += k % 10; //8 -> 206, 9 -> 215, -> 1 -> 216
                k /= 10; // 21 2
            }
            if (sum == n) { // 216 == 216
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
