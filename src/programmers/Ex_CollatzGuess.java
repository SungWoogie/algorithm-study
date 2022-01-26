package programmers;

public class Ex_CollatzGuess {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(solution(num));

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
            if (500 <= answer) {
                return -1;
            }
        }
        return answer;
    }
}