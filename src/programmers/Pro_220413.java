package programmers;

import java.util.Scanner;

public class Pro_220413 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(solution(x));

    }

    public static boolean solution(int x) {
        boolean answer = true;

        int num = x;
        int sum = 0;

        while (num > 0) { // num 이 0 보다 클 때 까지 반복
            sum += num % 10; // 넘에서 퍼센트 10한 값을 sum 에 게속 더한다.
            num /= 10; // num 에서 나눴을 때 몫으로 0 보다 클 때 까지 반복
        }
        if (x % sum == 0) {
            return answer;
        } else {
            return false;
        }
    }
}
