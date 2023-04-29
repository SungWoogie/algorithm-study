package programmers;

// 나머지 구하기
public class P230429 {
    public static void main(String[] args) {
        System.out.println(solution(3, 2));
        System.out.println(solution(10, 5));
    }

    public static int solution(int num1, int num2) {
        return num1 % num2;
    }

}

