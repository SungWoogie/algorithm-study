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

        int num = x; // 111
        int sum = 0;

        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        if (x % sum == 0) {
            return answer;
        } else {
            return false;
        }
    }
}
