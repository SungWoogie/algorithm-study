package programmers;

public class Pro_220424 {
    public static void main(String[] args) {
        int n = 987;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        int num = n;

        while (num > 0) {
            answer +=  num % 10;
            num /= 10;
        }

        return answer;
    }
}
