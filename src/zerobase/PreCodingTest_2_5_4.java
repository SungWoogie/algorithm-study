package zerobase;

// 이진 트리 노드 개수 정수로 반환
public class PreCodingTest_2_5_4 {
    public static int solution(int n) {
        long totalCount = 1;

        for (int i = 1; i <= n; i++) {
            totalCount *= 2;
            totalCount %= 1_000_000_007;
        }

        return (int) (totalCount - 1);
    }

    public static void main(String[] args) {
        System.out.println(solution(5)); // 31
    }
}

