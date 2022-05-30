package programmers;

public class Pro_220528 {   // 약수의 개수와 덧셈
    public static int solution(int left, int right) {
        int answer = 0; // 리턴 할 값

        for (int i = left; i <= right; i++) {   // left ~ right 까지 반복
            int count = 0;  // 약수 개수 세기 위한 저장공간
            for (int j = 1; j <= i; j++) {  // 약수 구하는 로직
                if (i % j == 0) {
                    count++;
                }
            }
            if (count % 2 == 0) {   // 짝수면 값을 더해준다.
                answer += i;
            } else {
                answer -= i;    // 홀수면 값을 뺀다.
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
