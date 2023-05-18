package zerobase;

public class PreCodingTest_230518_4 {
    public static int solution(String s) {
        int answer = 0;

        int num = 0;
        int calculate = 1;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (Character.isDigit(currentChar)) {
                num = (currentChar - '0') + num * 10; // 숫자랑 - '0' 하게되면 10 진수로 빼는거 참고
            } else if (currentChar == '+') {
                answer += calculate * num;
                num = 0;
                calculate = 1;
            } else if (currentChar == '-') {
                answer += calculate * num;
                num = 0;
                calculate = -1;
            }
        }
        answer += calculate * num;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("-3+26-7")); // 16
    }

}
