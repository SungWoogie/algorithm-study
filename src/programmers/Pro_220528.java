package programmers;

public class Pro_220528 {
    public static int solution(int left, int right) {
        int answer = 0;
        int count = 0;

        for (int i = left; i < right; i++) {
            count = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                answer += i;
            } else {
                answer += (i * -1);
            }
        }
        return answer;
    }

    public int solution2(int left, int right) {
        int answer = 0;
        int cnt = 0;
        for (int i = left; i <= right; i++) {
            cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) cnt++;
            }
            if (cnt % 2 == 0) {
                answer += i;
            } else {
                answer += i * -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int left = 24;
        int right = 27;

        System.out.println(solution(left, right));
    }
}
