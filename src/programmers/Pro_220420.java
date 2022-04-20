package programmers;

public class Pro_220420 {
    public static void main(String[] args) {
        long n = 3;

        System.out.println(solution(n));

    }

    public static long solution(long n) {

        long answer = 0;

        for (long i = 1; i <= n; i++) { // n까지 반복하는 반복문 생성
            if (i * i == n) { // 1부터 곱해서 파라미터로 넘어온 값과 같은지 확인
                answer = (i + 1) * (i + 1); // 같으면 +1을하고 그 제곱 곱해서 리턴
                return answer;
            }
        }
        return -1; // n번 돌때까지 제곱하는 값이 없으면 -1을 리턴
    }
}
