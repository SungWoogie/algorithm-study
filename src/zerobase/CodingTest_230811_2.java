package zerobase;

public class CodingTest_230811_2 {
    public static int solution(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        int[] lastPositions = new int[10];

        for (int i = 0; i < digits.length; i++) {
            lastPositions[digits[i] - '0'] = i;
        }

        for (int i = 0; i < digits.length; i++) {
            for (int d = 9; d > digits[i] - '0'; d--) {
                if (lastPositions[d] > i) {
                    char temp = digits[i];
                    digits[i] = digits[lastPositions[d]];
                    digits[lastPositions[d]] = temp;
                    return Integer.parseInt(new String(digits));
                }
            }
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(solution(43824)); // 83424
    }

}
