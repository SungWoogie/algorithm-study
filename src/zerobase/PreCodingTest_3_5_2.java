package zerobase;

// K 값을 N 에 넣어 가장 큰 수 만들기 (세모)
public class PreCodingTest_3_5_2 {
    public static int solution(int N, int K) {
        if (N == 0) {
            return K * 10;
        } else if (N == 10_000 || N == -10_000){
            return N;
        }

        String number = Integer.toString(N);
        StringBuilder sb = new StringBuilder(number);
        if (N < 0) {
            sb.insert(1, K);
        } else {
            sb.insert(0, K);
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(solution(10000, 1)); // 3278
        System.out.println(solution(278, 3)); // 3278
        System.out.println(solution(-278, 3)); // -3278
    }
}

