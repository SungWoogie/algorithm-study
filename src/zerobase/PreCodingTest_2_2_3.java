package zerobase;
// 어떤 수의 세제곱 구하기
public class PreCodingTest_2_2_3 {
    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i * i * i <= n; i++) {
            answer = i * i * i;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(15)); // 8
        System.out.println(solution(99)); // 64
    }
}
