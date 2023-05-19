package zerobase;

public class PreCodingTest_230519_2 {
    public static int solution(String[] arr) {
        int answer = 0;
        for (String binary : arr) {
            int decimal = Integer.parseInt(binary, 2); // 이진수를 십진수로 변환
            answer ^= decimal; // xor 연산 수행
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"10110", "1010","11110"})); // 2
        // 10110 = 22
        // 1010 = 10
        // 11110 = 30
    }

}
