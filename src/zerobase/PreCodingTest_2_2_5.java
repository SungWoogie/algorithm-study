package zerobase;

// 뒤집어서 조건에 맞게 출력 (0 제거, -)
public class PreCodingTest_2_2_5 {
    public static int solution(int num) {
        int answer = 0;

        StringBuilder stringBuilder = new StringBuilder();

        if (num < 0) {
            stringBuilder.append("-");
            num *= -1;
        }
        while (num > 0) {
            stringBuilder.append(num % 10);
            num /= 10;
        }

        if (Integer.parseInt(stringBuilder.toString()) >= 100_000 ||
                Integer.parseInt(stringBuilder.toString()) <= -100_000) {
            return 0;
        }
        System.out.println();

        answer = Integer.parseInt(stringBuilder.toString());
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(123_456));
        System.out.println(solution(-100_000));
        System.out.println(solution(340)); // 43
        System.out.println(solution(-587)); // -785
    }
}