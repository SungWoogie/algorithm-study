package zerobase;

public class PreCodingTest_230519_1 {
    public static String solution(int[] arr) {
        String answer = "";

        StringBuilder stringBuilder = new StringBuilder();
        for (int word : arr) {
            char c = (char) word;
            stringBuilder.append(c);
        }
        answer = stringBuilder.toString();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{71, 111, 111, 103, 108, 101})); // Google
    }

}
