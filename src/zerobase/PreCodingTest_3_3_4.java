package zerobase;

// 최소 화폐 개수
public class PreCodingTest_3_3_4 {
    public static int solution(int A) {
        int answer = 0;
        int[] currency = {50_000, 10_000, 5_000, 1_000, 500, 100, 50, 10, 5, 1};

        for (int money : currency) {
            answer += A / money;
            A %= money;

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(12345)); // 11
    }
}

