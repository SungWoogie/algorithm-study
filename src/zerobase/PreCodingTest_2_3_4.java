package zerobase;

// 비트 뒤집기
public class PreCodingTest_2_3_4 {
    public static int solution(int A, int B) {
        int answer = 0;
        int xor = A ^ B;

        while (xor != 0) {
            if ((xor & 1) == 1) {
                answer++;
            }
            xor >>= 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(29, 15)); //
    }
}

