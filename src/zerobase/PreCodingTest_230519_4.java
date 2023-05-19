package zerobase;

public class PreCodingTest_230519_4 {
    public static String solution(String s) {
        String answer = "";
        int decimal = Integer.parseInt(s, 16);
        answer = Integer.toBinaryString(decimal);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("f4")); // 11110100
    }

}
