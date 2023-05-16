package zerobase;

// 모래성
public class CodingTest_230516_2 {
    public static boolean solution(int num) {
        boolean answer = true;
        if (num <= 0 || num % 4 == 1) {
            // 모래성이 1 미만이거나 본인 차례에 1을 남겼을 때 패배
            answer = false;
        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(4)); // t
        System.out.println(solution(5)); // f
    }

}
