package zerobase;


public class CodingTest_230516_5 {
    public static int solution(String S) {
        int answer = 0;
        int num = Integer.parseInt(S, 2); // 이진수 문자열을 십진수로 변환

        while (num != 0) {
            if (num % 2 == 0) { // 숫자가 짝수인 경우
                num /= 2;
            } else { // 숫자가 홀수인 경우
                num -= 1;
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("1101"));
    }

}
