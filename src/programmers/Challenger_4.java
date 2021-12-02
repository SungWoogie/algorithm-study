package programmers;

public class Challenger_4 {
    public static void main(String[] args) {
        int x = 8;
        boolean answer = solution(x);
        System.out.println(answer);
//        boolean answer = sungJun(x);
//        System.out.println(answer);
    }

    public static boolean solution(int x) {
        boolean answer = true;

        int num = x;
        int percent = 0; // 일의자리
        int divide = 0; // 나누기
        int value = 0; // 십의자리 + 나눈 값 더하기

        while (0 < x) {
            percent += x % 10; // 2 2
            divide = x / 10; // 2
            x = divide;
        }
        value = percent + divide;
        int result = num % value;

        if (result != 0) {
            answer = false;
        }
        return answer;
    }

    public static boolean sungJun(int x) {
        int num = x;
        int value = 0;

        while (num > 0) {
            int 일의자리 = num % 10;
            num = num / 10;
            value += 일의자리;
        }

        if (x % value == 0) {
            return true;
        } else {
            return false;
        }
    }
}
