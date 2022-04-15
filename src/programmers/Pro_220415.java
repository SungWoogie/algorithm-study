package programmers;

import java.util.Scanner;

public class Pro_220415 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(solution(n));

    }

    public static int solution(int num) {
        int answer = 0;

        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 2 == 1) {
                num = (num * 3) + 1;
            }
            answer++;
            if (answer > 500) {
                return -1;
            }
        }
        return answer;
    }
}
