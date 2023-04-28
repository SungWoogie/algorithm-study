package programmers;

// Lv 0 콜라 문제
public class P230427_1 {
    public static void main(String[] args) {
        System.out.println(solution(2, 1, 20)); // 19
        System.out.println(solution(3, 1, 20)); // 9
    }

    // a = 나눠줄 수 있는 개수, b = 바꿔줄 수 있는 개수, n = 처음에 바꾸려고 하는 개수
    public static int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) { // 처음에 가지고 있는 빈병의 개수가
            answer += (n / a) * b;
            int percent = n % a;
            n = (n / a) * b + percent;
        }
        return answer;
    }
}
